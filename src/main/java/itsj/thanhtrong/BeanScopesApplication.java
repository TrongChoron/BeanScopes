package itsj.thanhtrong;

import itsj.thanhtrong.prototype.PrototypeMessage;
import itsj.thanhtrong.singleton.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanScopesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanScopesApplication.class, args);

        // Example for Prototype ScopeBean
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        PrototypeMessage msgA = (PrototypeMessage) context.getBean("Hi! World");

        msgA.setMessage("This is message A");
        msgA.getMessage();

        PrototypeMessage msgB = (PrototypeMessage) context.getBean("Hi! World");
        msgB.getMessage();

        // Example for Singleton Bean
        Person personA = (Person) context.getBean("personSingleton");

        personA.setName("Trong");
        System.out.println(personA.getName());

        Person personB = (Person) context.getBean("personSingleton");
        System.out.println(personB.getName());
    }

}
