package com.asterisk.daily.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Shape implements Cloneable{
    private Long id;
    protected String type;

    abstract void draw();

    public Object clone(){
        Object clone =null;
        try {
            clone=super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Exception : "+e.getMessage());
        }
        return clone;
    }
}
