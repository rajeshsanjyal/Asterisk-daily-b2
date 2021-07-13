package com.asterisk.daily.prototype;

public class ShapeFactory {

    private static final Shape circle=new Circle();
    private static final Shape rectangle=new Rectangle();
    static {
        System.out.println("-----Starting Loading out prototype shape-----");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println("-----Ended Loading out prototype shape-----");
    }
    private static Shape[] shapes=new Shape[]
            {
                    circle,
                    rectangle
            };
    public static Shape getShape(String type){
        for (int i = 0; i <= shapes.length; i++) {
            if (shapes[i].getType().equals(type)){
                return (Shape) shapes[i].clone();
            }
        }
        return null;

    }
}
