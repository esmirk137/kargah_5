package com.company;

/**
 * This class represent a circle.
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 1.0.0
 * @since Mar.30.2020
 */
public class Circle extends Shape{
    // radius of circle
    private int radius;

    /**
     * This is constructor of this class and get radius as input parameter and fix it on field.
     * @param radius is an integer for radius field of circle
     */
    public Circle(int radius){
        this.radius=radius;
    }

    /**
     * get an integer as radius of circle.
     * @return radius field
     */
    public int getRadius() {
        return radius;
    }

    /**
     * This method is override of a method in super class (shape class) and calculate perimeter of circle and return it.
     * @return a double that show perimeter of circle
     */
    @Override
    public double calculatePerimeter(){
        return 2*radius*Math.PI;
    }

    /**
     * This method is override of a method in super class (shape class) and calculate area of circle and return it.
     * @return a double that show area of circle
     */
    @Override
    public double calculateArea(){
        return radius*radius*Math.PI;
    }

    /**
     * Override of toString method return details of circle include its radius as string.
     * @return details as string
     */
    @Override
    public String toString() {
        return "Circle:: radius:" + radius;
    }
}
