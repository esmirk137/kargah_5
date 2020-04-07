package com.company;

/**
 * This class represent a triangle shape.
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 1.0.0
 * @since Mar.30.2020
 */
public class Triangle extends Polygon{

    /**
     * This is constructor of Triangle class.
     * @param slides is slides of triangle
     */
    public Triangle(Integer...slides){
        super(slides);
    }

    /**
     * This method determinate a triangle is a equilateral or not.
     * @return answer as boolean
     */
    public boolean isEquilateral(){
        double temp=getSlides().get(0);
        for(Integer slide: getSlides()){
            if(temp!=slide) return false;
            temp=slide;
        }
        return true;
    }

    /**
     * This method is override of a method in super class (shape class) and calculate perimeter of triangle and return it.
     * @return a double that show perimeter of triangle
     */
    @Override
    public double calculatePerimeter(){
        return getSlides().get(0)+getSlides().get(1)+getSlides().get(2);
    }

    /**
     * This method is override of a method in super class (shape class) and calculate area of triangle and return it.
     * @return a double that show area of triangle
     */
    @Override
    public double calculateArea(){
        double temp=calculatePerimeter()/2;
        return Math.sqrt(temp*(temp-getSlides().get(0))*(temp-getSlides().get(1))*(temp-getSlides().get(2)));
    }

    /**
     * Override of toString method return details of triangle include its slide as string.
     * @return details as string
     */
    @Override
    public String toString() {
        return "Triangle:: slide1:" + getSlides().get(0) + ", slide2:" + getSlides().get(1) + ", slide3:" + getSlides().get(2);
    }
}
