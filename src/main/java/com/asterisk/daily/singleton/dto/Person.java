package com.asterisk.daily.singleton.dto;

public class Person {
//    private Long id;
//    private String name;
//    private String address;
//    private  String contactno;

    private static Person person=null;
    private Person() {

    }
    public static Person getInstance(){
        synchronized (Person.class) {
            if (person == null) {
                person = new Person();
            }
        }
        return person;
    }

//    public Person(Long id, String name, String address, String contactno) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.contactno = contactno;
//    }

//    public Long getId() {
//        return id;
//    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getContactno() {
//        return contactno;
//    }
//
//    public void setContactno(String contactno) {
//        this.contactno = contactno;
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", contactno='" + contactno + '\'' +
//                '}';
//    }
}
