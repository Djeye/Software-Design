package com.company.task_1;

import org.junit.*;

public class Square extends Assert {
    private float side;

    public double calc_area(){
        if (this.side >=0 ){
            return Math.pow(this.side, 2);
        }
        else return -1f;
    }

    @Test
    public void test_square() {
        setSide(1f);
        assertEquals(calc_area(), 1f, 0.001f);

        setSide(2f);
        assertEquals(calc_area(), 4f, 0.001f);

        setSide(-5f);
        assertEquals(calc_area(), -1f, 0.001f);

    }
    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
}
