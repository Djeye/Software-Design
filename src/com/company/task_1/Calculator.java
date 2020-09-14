package com.company.task_1;

public class Calculator {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.setA_side(4f);
        rec.setB_side(3f);
        Square square = new Square();
        square.setSide(2.5f);
        Circle circle = new Circle();
        circle.setRadius(5f);

        System.out.format("Rectangle area is: %.3f \n", rec.calc_area());
        System.out.format("Square area is: %.3f \n", square.calc_area());
        System.out.format("Circle area is: %.3f \n", circle.calc_area());
    }
}
