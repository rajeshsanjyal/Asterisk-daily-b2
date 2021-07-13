package com.asterisk.daily.di;

public class Car {
    private String vrn;
    private String model;
    private String type;

//    @Autowired
//    @Qualifier("WithTurbo")
    private Engine engine;


    public Car(FourStrokeEngine fourStrokeEngine){
//        engine.start();
    }
}
