package itsj.thanhtrong.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 11:27
 * Filename : Person
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    @Scope("singleton")
    public Person personSingleton() {
        return new Person();
    }
}
