package com.asterisk.daily.adapter;

public class MobilePhoneCharger implements Target{
    private ElectricSocket electricSocket=new ElectricSocket();

    @Override
    public Volt getVolt() {

        Volt volt=electricSocket.getVolt();
        Volt convertedVolt=convertedVolt(volt,34);
        return convertedVolt;

//        return electricSocket.getVolt();
//        Volt convertedVolt=converted
    }
    private Volt convertedVolt(Volt volt,int i){
        return new Volt(volt.getVolt()/i);
    }
}
