package com.practice.spring.beans;
import java.time.*;
public class LinkedIn {
    String Login;
    String Logout;
    LocalTime time;

    public String getLogin() {
        System.out.println(time);
        return Login;

    }

    public void setLogin(String login) {
        time=LocalTime.now();

        Login = login;
    }

    public String getLogout() {
        return Logout;
    }

    public void setLogout(String logout) {
        Logout = logout;
    }
}
