package com.asterisk.daily.factory;

public class DivCommand extends MathCommand{


    @Override
    public double calculate(Double x, Double y) {

        return x/y;
    }
}
