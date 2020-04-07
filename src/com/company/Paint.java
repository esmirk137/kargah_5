package com.company;

import java.util.ArrayList;

/**
 * This class is for drawing shapes.
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 1.0.0
 * @since Mar.30.2020
 */
public class Paint {
    // shapes for drawing
    private ArrayList<Shape> shapes;

    /**
     * This is constructor of Paint class and just allocate list of shapes.
     */
    public Paint(){
        shapes=new ArrayList<>();
    }

    /**
     * If input shape does not exist in the list add it to list otherwise show an appropriate massage.
     * @param shape is a input shape for adding to list
     */
    public void addShape(Shape shape){
        for(Shape shape1: shapes)
            if(shape1.equals(shape)){
                System.out.println("This shape already exist in list.");
                return;
            }
        shapes.add(shape);
    }

    /**
     * drawAll method show number of all the shape in the list.
     */
    public void drawAll(){
        int counterOfTriangle=0, counterOfCircle=0, counterOfRectangle=0;
        for(Shape shape: shapes) {
            if(shape instanceof Triangle)
                counterOfTriangle++;
            else if(shape instanceof Rectangle)
                counterOfRectangle++;
            else if(shape instanceof Circle)
                counterOfCircle++;

        }
        System.out.println("Number of triangle in the list: " + counterOfTriangle + "\nNumber of rectangle in the list: " + counterOfRectangle + "\nNumber of circle in the list: " + counterOfCircle);
    }

    /**
     * This method show all the shape in the list.
     */
    public void printAll(){
        for(Shape shape: shapes)
            System.out.println(shape);
    }

    /**
     * This method show regular polygon in the list.
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Triangle)
                if (((Triangle) shape).isEquilateral())
                    System.out.println(shape.toString());
            if (shape instanceof Rectangle)
                if (((Rectangle) shape).isSquare())
                    System.out.println(shape.toString());
        }
    }
}
