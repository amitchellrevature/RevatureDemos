package com.alec.day7;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Cone{
    void draw(){
        System.out.println("drawing code...");
    }
}

class Test{
    // creating a method that accepts only child class of shape class
    public static void drawShape(List<? extends Shape> list){
        for(Shape shape: list){
            shape.draw(); // calling method of shape class by child class instance
        }
    }
}


public class Demo7 {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Test.drawShape(rectangleList);
        Test.drawShape(circleList);
        //Test.drawShape(coneList);
    }
}
