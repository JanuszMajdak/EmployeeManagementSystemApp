package pl.januszmajdak.employeesmansys.dao;

import org.apache.log4j.Logger;
import org.hibernate.*;
import pl.januszmajdak.employeesmansys.entities.Employee;
import pl.januszmajdak.employeesmansys.hibernate.HibernateUtil;

import java.util.List;
import java.util.Optional;


public class EmployeeDaoImpl implements EmployeeDao {

    private static Logger logger = Logger.getLogger(EmployeeDaoImpl.class);


    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


    @Override
    public List<Employee> findAll() {


        Session session = sessionFactory.openSession();

        Query query = session.createQuery("select e from Employee e");

        return (List<Employee>) query.list();
    }

/*    @Override
    public Optional<List<Employee>> findAll() {

        Session session = sessionFactory.openSession();

        List<Employee> employeeList = null;

        try {
            Transaction transaction = session.beginTransaction();
            employeeList = (List<Employee>) session.find(Employee.class, employeeList);

            transaction.commit();
        } catch (HibernateException ex) {
            logger.error("Problem during getting list of employees: " + ex.getMessage());
        } finally {
            return Optional.ofNullable(employeeList);
        }

    }*/

    @Override
    public Optional<Employee> findById(Long id) {

        Session session = sessionFactory.openSession();
        Employee employee = null;

        try {
            Transaction transaction = session.beginTransaction();
            employee = session.find(Employee.class, id);

            transaction.commit();

        } catch (HibernateException ex) {
            logger.error("Problem during getting employee by id=" + id + " " + ex.getMessage());
        } finally {
            return Optional.ofNullable(employee);
        }

    }

    @Override
    public void saveEmployee(Employee employee) {

        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(employee);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            logger.error("Problem during insert employee " + employee.toString() + " message " + ex.getMessage());
        }

    }

    @Override
    public void deleteEmployee(Long id) {
        Transaction transaction = null;

        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Employee employee = session.find(Employee.class, id);
            session.remove(employee);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            logger.error("Problem during delete tweet with id " + id);
        }
    }
}
