package com.asterisk.daily.singleton;

import com.asterisk.daily.singleton.dto.Person;

public class SingletonTester {
    public static void main(String[] args) {
        new Thread(()->{
            Person person1=Person.getInstance();
            System.out.println(person1);
        }).start();
        new Thread(()->{
            Person person1=Person.getInstance();
            System.out.println(person1);
        }).start();
//        Person person1=Person.getInstance();
//        person1.setId(1L);
//        person1.setName("Rajesh");
//        person1.setContactno("9809808761");
//        person1.setAddress("Lamki");
//        System.out.println(person1);
//
//        Person person2=Person.getInstance();
//
//        person2.setId(2L);
////        System.out.println(person1);
//        person2.setName("Raj");
//        person2.setContactno("9909808761");
//        person2.setAddress("Lamki");
//
//        System.out.println(person2);

//        Person person1=new Person(1L,"Rajesh","Nepal","9868549759");
//        Person person2=new Person(1L,"Raj","Nepal","9868549759");
//        Person person3=new Person(1L,"Esh","Nepal","9868549759");
//        Person person4=new Person(1L,"Raje","Nepal","9868549759");
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);

    }
}
