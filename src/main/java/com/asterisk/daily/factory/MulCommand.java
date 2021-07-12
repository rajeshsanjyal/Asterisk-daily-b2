package com.asterisk.daily.factory;

public class MulCommand extends MathCommand{


    @Override
    public double calculate(Double x, Double y) {
        return x*y;
    }
}
