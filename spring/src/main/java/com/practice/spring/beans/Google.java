package com.practice.spring.beans;

public class Google {
    String Login;
    String Logout;
    Facebook fb;
    LinkedIn ln;
    Github gb;
    Whatsapp wa;

    public Facebook getFb() {
        return fb;
    }

    public void setFb(Facebook fb) {
        this.fb = fb;
    }

    public LinkedIn getLn() {
        return ln;
    }

    public void setLn(LinkedIn ln) {
        this.ln = ln;
    }

    public Github getGb() {
        return gb;
    }

    public void setGb(Github gb) {
        this.gb = gb;
    }

    public Whatsapp getWa() {
        return wa;
    }

    public void setWa(Whatsapp wa) {
        this.wa = wa;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getLogout() {
        return Logout;
    }

    public void setLogout(String logout) {
        Logout = logout;
    }
    public void name(){
        System.out.println(Login+" "+Logout);
    }

}
