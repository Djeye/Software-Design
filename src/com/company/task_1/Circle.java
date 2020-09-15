package com.company.task_1;

import org.junit.*;

public class Circle extends Assert{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double calc_area(){
        if (this.radius >= 0) {
            return Math.PI * Math.pow(this.radius, 2);
        }
        else return -1f; //Exception
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
