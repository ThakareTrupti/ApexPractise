package com.trupti.practise;

public class AbstractEx {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.r=10;
        System.out.println(circle.area());
        Square sq=new Square();
        sq.a=2;
        System.out.println(sq.area());
        //////////////
        Shape shape=null;
        shape=new Circle(10);   // parent obj can ref to child obj memory
        System.out.println("It will print mem block"+shape);   // as it is static sq n circle refer to same block
        System.out.println(shape.area());
        System.out.println("It will print mem block sq "+shape);
        shape=new Square(3);
        shape.area();

    }
}
abstract class Shape{
    abstract public double area();
}
class Circle extends Shape{
    double r;
    public Circle()
    {

    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
}
class Square extends Shape{
    double a;
    public Square()
    {

    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }
}