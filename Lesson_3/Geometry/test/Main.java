package ru.nsu.Geometry.test;

import ru.nsu.Geometry.Circle;
import ru.nsu.Geometry.Figure;
import ru.nsu.Geometry.Rectangle;
import ru.nsu.Geometry.Square;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(100,50,10);
        Circle circle1 = new Circle(10,50,11);
        Circle circle2 = new Circle(100,2,16);
        ru.nsu.Geometry.Rectangle rectangle = new ru.nsu.Geometry.Rectangle(50, 50, 100, 150);
        ru.nsu.Geometry.Rectangle rectangle1 = new ru.nsu.Geometry.Rectangle(50, 50, 10, 15);
        ru.nsu.Geometry.Rectangle rectangle2 = new ru.nsu.Geometry.Rectangle(50, 50, 10, 1);
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getArea());
        Figure[] uns = {circle,circle1,circle2,rectangle,rectangle1,rectangle2};
        double unsw = 0;
        for (int i = 0; i < 6; i++){
            unsw += uns[i].getArea();
            System.out.println(uns[i]);
        }
        System.out.println(unsw);



//        System.out.println(circle.getR());
//        System.out.println(circle.getArea());
//        circle.setR(20);
//        System.out.println(circle.getR());
//        System.out.println(circle.getArea());
//        for (int i = 0; i< 2; i++){
//            System.out.print(circle.getCoords()[i] + "//");
//        }
//        System.out.println();
//        circle.moveX(20);
//        circle.moveY(30);
//        for (int i = 0; i< 2; i++){
//            System.out.print(circle.getCoords()[i] + "//");
//        }
//        System.out.println();
        Square square = new Square(100, 100, 150, 150);
        System.out.println(square.getArea());
        System.out.println(square.getA());
        square.setA(40);
        System.out.println(square.getArea());
        square.getCoords();
////        square.setX(40);
////        square.setY(60);
////        System.out.println(square.getX());
////        System.out.println(square.getY());
//
//        Rectangle rectangle = new Rectangle(50, 50, 100, 150);
//        for (int i = 0; i< 4; i++){
//            System.out.print(rectangle.getCoords()[i] + "//");
//        }
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getLenght());
//        System.out.println(rectangle.getWidth());
//        for (int i = 0; i< 4; i++){
//            System.out.print(rectangle.getCoords()[i] + "//");
//        }
//        System.out.println();
//        rectangle.moveX(40);
//        rectangle.moveY(50);
//        for (int i = 0; i< 4; i++){
//            System.out.print(rectangle.getCoords()[i] + "//");
//        }
//        System.out.println();
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getLenght());
//        System.out.println(rectangle.getWidth());
//        rectangle.changeSize(1.5);
//        System.out.println(rectangle.getArea());
//        for (int i = 0; i< 4; i++){
//            System.out.print(rectangle.getCoords()[i] + "//");
//        }
//
//
    }
}

