package com.company.task_1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tester {
    Circle circle = new Circle(5f);
    Rectangle rec = new Rectangle(2.5f, 5f);
    Square square = new Square(3f);


    @Test
    public void circle_tests()
    {
        circle.setRadius(0f);
        assertEquals(circle.calc_area(), 0f, 0.001f);

        circle.setRadius(1f);
        assertEquals(circle.calc_area(), Math.PI, 0.001f);

        circle.setRadius(2f);
        assertEquals(circle.calc_area(), 4 * Math.PI, 0.001f);

        circle.setRadius(-1f);
        assertEquals(circle.calc_area(), -1f, 0.001f);

        circle.setRadius(-0.1f);
        assertEquals(circle.calc_area(), -1f, 0.001f);
    }

    @Test
    public void test_square() {
        square.setSide(1f);
        assertEquals(square.calc_area(), 1f, 0.001f);

        square.setSide(2f);
        assertEquals(square.calc_area(), 4f, 0.001f);

        square.setSide(-5f);
        assertEquals(square.calc_area(), -1f, 0.001f);

    }

    @Test
    public void test_rectangle(){
        rec.setA_side(1f);
        rec.setB_side(1f);
        assertEquals(rec.calc_area(), 1f, 0.001f);

        rec.setA_side(-6f);
        rec.setB_side(4f);
        assertEquals(rec.calc_area(), -1f, 0.001f);

        rec.setA_side(3f);
        rec.setB_side(-2f);
        assertEquals(rec.calc_area(), -1f, 0.001f);

        rec.setA_side(3f);
        rec.setB_side(4f);
        assertEquals(rec.calc_area(), 12f, 0.001f);

        rec.setA_side(10f);
        rec.setB_side(5f);
        assertEquals(rec.calc_area(), 50f, 0.001f);

        rec.setA_side(0.5f);
        rec.setB_side(4f);
        assertEquals(rec.calc_area(), 2f, 0.001f);
    }


}
