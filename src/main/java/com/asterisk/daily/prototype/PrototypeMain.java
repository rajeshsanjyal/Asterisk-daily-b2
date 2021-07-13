package com.asterisk.daily.prototype;

import java.util.Objects;

public class PrototypeMain {
    public static void main(String[] args) {

        Shape circle=ShapeFactory.getShape("Circle");
        System.out.println(circle);
        Shape rectangle=ShapeFactory.getShape("Rectangle");
        System.out.println(rectangle);
    }
}
