package pl.januszmajdak.employeesmansys.services;

public class LoginServiceInMemoryImpl implements LoginService {

    @Override
    public boolean login(String login, String password) {

        if (("admin".equals(login) && "admin".equals(password)) ||

                ("test".equals(login) && "test".equals(password))) {

            return true;

        } else {
            return false;

        }

    }
}