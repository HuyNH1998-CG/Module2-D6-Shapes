package com.codegym;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("blu", false);
        System.out.println(shape1);

        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(5);
        System.out.println(circle1);
        Circle circle2 = new Circle(5,"red",false);
        System.out.println(circle2);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(10,5);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(20,10,"green",false);
        System.out.println(rectangle2);

        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(5);
        System.out.println(square1);
        Square square2 = new Square(5,"green",false);
        System.out.println(square2);
    }
}
