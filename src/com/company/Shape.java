package com.company;

/**
 * This class represent a geometrical shape.
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 1.0.0
 * @since Mar.30.2020
 */
public class Shape {

    /**
     * This method calculate perimeter of shape and return it.
     * @return a double that show perimeter of shape
     */
    public double calculatePerimeter(){
        return 0;
    }

    /**
     * This method calculate area of shape and return it.
     * @return a double that show area of shape
     */
    public double calculateArea(){
        return 0;
    }

    /**
     * This method show kind of shape
     */
    public void draw(){
    }

    /**
     * This method is override of equals method for shape class.
     * @param obj for comparing
     * @return answer as boolean
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * This is override of hashCode method for shape class and compare their hash code.
     * @return answer as boolean
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Override of toString method return details of shape as string.
     * @return details as string
     */
    @Override
    public String toString() {
        return "Shape{}";
    }

}
