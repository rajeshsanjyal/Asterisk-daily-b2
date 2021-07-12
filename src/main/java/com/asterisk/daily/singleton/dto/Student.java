package com.asterisk.daily.singleton.dto;

public class Student {
    private static int id;
    private String name;

    public Student(String name) {
        id++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='"+id+'\''+
                ","+
                "name='" + name + '\'' +
                '}';
    }
}
