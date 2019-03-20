package pl.januszmajdak.employeesmansys.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "confirmed_password")
    private String confirmedPassword;

    @Column(name = "mobile_phone_number")
    private Integer mobilePhoneNum;

    @Column(name = "gender")
    private String gender;

    @Column(name = "position")
    private String position;

    @Column(name = "department")
    private String department;

    @Column(name = "email")
    private String eMail;

    @Column(name = "date_of_joining")
    private LocalDate dateOfJoining;

    @Column(name = "education")
    private String education;

    @Column(name = "software_skills")
    private String softwareSkills;

    @Column(name = "personal_skills")
    private String PersonalSkills;

    @Column(name = "current_address")
    private String currentAddress;

    @Column(name = "permament_address")
    private String permanentAddress;

    public Employee(){

    }

    public Employee(Long id, String firstName, String lastName, String fatherName, String motherName, LocalDate dateOfBirth, String login, String password, String confirmedPassword, Integer mobilePhoneNum, String gender, String position, String department, String eMail, LocalDate dateOfJoining, String education, String softwareSkills, String personalSkills, String currentAddress, String permanentAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateOfBirth = dateOfBirth;
        this.login = login;
        this.password = password;
        this.confirmedPassword = confirmedPassword;
        this.mobilePhoneNum = mobilePhoneNum;
        this.gender = gender;
        this.position = position;
        this.department = department;
        this.eMail = eMail;
        this.dateOfJoining = dateOfJoining;
        this.education = education;
        this.softwareSkills = softwareSkills;
        PersonalSkills = personalSkills;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public Integer getMobilePhoneNum() {
        return mobilePhoneNum;
    }

    public void setMobilePhoneNum(Integer mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSoftwareSkills() {
        return softwareSkills;
    }

    public void setSoftwareSkills(String softwareSkills) {
        this.softwareSkills = softwareSkills;
    }

    public String getPersonalSkills() {
        return PersonalSkills;
    }

    public void setPersonalSkills(String personalSkills) {
        PersonalSkills = personalSkills;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmedPassword='" + confirmedPassword + '\'' +
                ", mobilePhoneNum=" + mobilePhoneNum +
                ", gender='" + gender + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", eMail='" + eMail + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", education='" + education + '\'' +
                ", softwareSkills='" + softwareSkills + '\'' +
                ", PersonalSkills='" + PersonalSkills + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                '}';
    }
}
