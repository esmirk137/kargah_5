package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class represent polygon shape like triangle.
 * @author Sayed Mohammad Ali Mirkazemi
 * @version 1.0.0
 * @since Mar.30.2020
 */
public class Polygon extends Shape{
    // slides of shape
    private ArrayList<Integer> slides;

    /**
     * This is constructor of this class and get some double as size of slides.
     * @param slides is size of slides of shape
     */
    public Polygon(Integer...slides){
        this.slides=new ArrayList<>();
        this.slides.addAll(Arrays.asList(slides));
    }

    /**
     * get an array list as slides of shape.
     * @return slides field
     */
    public ArrayList<Integer> getSlides() {
        return slides;
    }
}
