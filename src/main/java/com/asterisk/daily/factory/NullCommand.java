package com.asterisk.daily.factory;

public class NullCommand extends MathCommand{


    @Override
    public double calculate(Double x, Double y) {

        return 0.0 ;
    }
}
