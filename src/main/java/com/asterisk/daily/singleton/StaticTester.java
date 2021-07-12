package com.asterisk.daily.singleton;

import com.asterisk.daily.singleton.dto.Student;

public class StaticTester {
    public static void main(String[] args) {
        System.out.println(new Student("Rajesh1"));
        System.out.println(new Student("Rajesh2"));
        System.out.println(new Student("Rajesh3"));
        System.out.println(new Student("Rajesh4"));
        System.out.println(new Student("Rajesh5"));
    }
}
