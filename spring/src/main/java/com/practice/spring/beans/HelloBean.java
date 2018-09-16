package com.practice.spring.beans;

public class HelloBean {

    String beanName;

    HiBean hiBean;

    public HelloBean(String beanName, HiBean hiBean) {
        this.beanName = beanName;
        this.hiBean = hiBean;
    }

   public HiBean getHiBean() {
        return hiBean;
    }

    public void setHiBean(HiBean hiBean) {
        this.hiBean = hiBean;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void printFullName(){
        System.out.println(this.beanName + " " + this.hiBean.getBeanName());
    }

    public void init(){
        System.out.println("Intializing Bean");
    }

    public void destroy(){
        System.out.println("Destroying Bean");
    }
}
