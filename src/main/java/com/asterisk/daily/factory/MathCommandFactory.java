package com.asterisk.daily.factory;

public class MathCommandFactory {
    public static MathCommand get(String operator){
        MathCommand mathCommand=null;
        switch (operator){
            case "add":
                mathCommand= new AddCommand();
                break;
            case "sub":
                mathCommand= new SubCommand();
                break;
            case "mul":
                mathCommand= new MulCommand();
                break;
            case "div":
                mathCommand= new DivCommand();
                break;
            default:
                mathCommand= new NullCommand();
                break;
        }
        return mathCommand;
    }
}
