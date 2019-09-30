package ru.nsu.home;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(100,50,10);

        System.out.println(circle.getR());
        System.out.println(circle.getArea());
        circle.setR(20);
        System.out.println(circle.getR());
        System.out.println(circle.getArea());
        System.out.println(circle.getX());
        circle.setX(20);
        System.out.println(circle.getX());

        Square square = new Square(100, 50, 50);
        System.out.println(square.getArea());
        System.out.println(square.getA());
        square.setA(40);
        System.out.println(square.getArea());
        square.setX(40);
        square.setY(60);
        System.out.println(square.getX());
        System.out.println(square.getY());

        Rectangle rectangle = new Rectangle(100, 50, 50, 70);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getA());
        rectangle.setA(40);
        System.out.println(rectangle.getArea());
        rectangle.setX(40);
        rectangle.setY(60);
        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());
    }
}

