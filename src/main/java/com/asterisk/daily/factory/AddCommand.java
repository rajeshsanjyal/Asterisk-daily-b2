package com.asterisk.daily.factory;

public class AddCommand extends MathCommand{


    @Override
    public double calculate(Double x, Double y) {
        return x+y;
    }
}
