package com.company.task_1;

import org.junit.*;

public class Rectangle extends Assert{
    private float a_side, b_side;

    public double calc_area(){
        if (this.a_side >=0 & this.b_side >= 0){
            return this.a_side * this.b_side;
        }
        else return -1f;
    }

    @Test
    public void test_rectangle(){
        setA_side(1f);
        setB_side(1f);
        assertEquals(calc_area(), 1f, 0.001f);

        setA_side(-6f);
        setB_side(4f);
        assertEquals(calc_area(), -1f, 0.001f);

        setA_side(3f);
        setB_side(-2f);
        assertEquals(calc_area(), -1f, 0.001f);

        setA_side(3f);
        setB_side(4f);
        assertEquals(calc_area(), 12f, 0.001f);

        setA_side(10f);
        setB_side(5f);
        assertEquals(calc_area(), 50f, 0.001f);

        setA_side(0.5f);
        setB_side(4f);
        assertEquals(calc_area(), 2f, 0.001f);

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
