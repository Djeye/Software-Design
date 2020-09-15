package com.company.task_1;

import org.junit.*;

public class Square extends Assert {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public double calc_area(){
        if (this.side >=0 ){
            return Math.pow(this.side, 2);
        }
        else return -1f;
    }


    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
}
