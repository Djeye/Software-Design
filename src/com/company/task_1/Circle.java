package com.company.task_1;

import org.junit.*;

public class Circle extends Assert{
    private float radius;

    public double calc_area(){
        if (this.radius >= 0) {
            return Math.PI * Math.pow(this.radius, 2);
        }
        else return -1f; //Exception
    }

    @Test
    public void circle_tests()
    {
        setRadius(0f);
        assertEquals(calc_area(), 0f, 0.001f);

        setRadius(1f);
        assertEquals(calc_area(), Math.PI, 0.001f);

        setRadius(2f);
        assertEquals(calc_area(), 4 * Math.PI, 0.001f);

        setRadius(-1f);
        assertEquals(calc_area(), -1f, 0.001f);

        setRadius(-0.1f);
        assertEquals(calc_area(), -1f, 0.001f);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
