package com.practice.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

        /*HelloBean helloBean = (HelloBean) context.getBean("helloBean");

        System.out.println(helloBean.getBeanName());

        helloBean.printFullName();

        HelloBean helloBean1 = (HelloBean) context.getBean("helloBean");

        System.out.println(helloBean.hashCode() + " : " + helloBean1.hashCode());
*/
       Google g=(Google)context.getBean("Google");
        System.out.println(g.getLogin());
        System.out.println(g.getLogout());
        g.name();


      /*  Facebook fb=(Facebook)context.getBean("Facebook");
        System.out.println(fb.getLogin());
        System.out.println(fb.getLogout());

        LinkedIn ln=(LinkedIn)context.getBean("LinkedIn");
        System.out.println(ln.getLogin());
        System.out.println(ln.getLogout());

        Github gb=(Github)context.getBean("Github");
        System.out.println(gb.getLogin());
        System.out.println(gb.getLogout());

        Whatsapp wp=(Whatsapp)context.getBean("Whatsapp");
        System.out.println(wp.getLogin());
        System.out.println(wp.getLogout());*/

    }
}
