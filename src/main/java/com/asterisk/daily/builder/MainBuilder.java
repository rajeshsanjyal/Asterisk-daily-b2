package com.asterisk.daily.builder;

public class MainBuilder {
    public static void main(String[] args) {
//        Department department=new Department()
//                .id(1L)
//                .numberOfMember(1)
//                .name("Alok");
        Department department=Department
                .builder()
                .id(1L)
                .name("Alok")
                .numberOfMember(200)
                .build();
        System.out.println(department);

    }
}
