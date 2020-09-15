package com.company.task_1;

import org.junit.*;

public class Rectangle extends Assert{
    private float a_side, b_side;

    public Rectangle(float a_side, float b_side) {
        this.a_side = a_side;
        this.b_side = b_side;
    }

    public double calc_area(){
        if (this.a_side >=0 & this.b_side >= 0){
            return this.a_side * this.b_side;
        }
        else return -1f;
    }



    public float getA_side() {
        return a_side;
    }

    public void setA_side(float a_side) {
        this.a_side = a_side;
    }

    public float getB_side() {
        return b_side;
    }

    public void setB_side(float b_side) {
        this.b_side = b_side;
    }
}
