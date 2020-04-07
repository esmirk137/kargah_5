package com.company;

/**
 * This class represent a rectangle shape.
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 1.0.0
 * @since Mar.30.2020
 */
public class Rectangle extends Polygon{

    /**
     * This is constructor of Rectangle class.
     * @param slides is slides of triangle
     */
    public Rectangle(Integer...slides){
        super(slides);
    }

    /**
     * This method determinate a rectangle is a square or not.
     * @return answer as boolean
     */
    public boolean isSquare(){
        double temp=getSlides().get(0);
        for(Integer slide: getSlides()){
            if(temp!=slide) return false;
            temp=slide;
        }
        return true;
    }

    /**
     * This method is override of a method in super class (shape class) and calculate perimeter of rectangle and return it.
     * @return a double that show perimeter of rectangle
     */
    @Override
    public double calculatePerimeter(){
        return getSlides().get(0)+getSlides().get(1)+getSlides().get(2)+getSlides().get(3);
    }

    /**
     * This method is override of a method in super class (shape class) and calculate area of rectangle and return it.
     * @return a double that show area of rectangle
     */
    @Override
    public double calculateArea(){
        if(getSlides().get(0).equals(getSlides().get(1)))
            return getSlides().get(0)*getSlides().get(2);
        else
            return getSlides().get(0)*getSlides().get(1);
    }

    /**
     * Override of toString method return details of triangle include its slide as string.
     * @return details as string
     */
    @Override
    public String toString() {
        return "Rectangle:: slide1:" + getSlides().get(0) + ", slide2:" + getSlides().get(1) + ", slide3:" + getSlides().get(2) + ", slide4:" + getSlides().get(3);
    }
}
