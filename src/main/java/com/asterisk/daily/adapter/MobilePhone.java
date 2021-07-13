package com.asterisk.daily.adapter;

public class MobilePhone {
    public static void main(String[] args) {
        new MobilePhone().chargeMe();

    }
    public void chargeMe(){
        Target target=new MobilePhoneCharger();
        Volt volt=target.getVolt();
        System.out.println("Charging with voltage: "+volt.getVolt());
    }
}
