package com.company;
import static java.lang.Math.PI;
import  java.lang.annotation.*;
public class Main {

    public static void main(String[ ] args) {
        Rectangle rectShape = new Rectangle(2, 3);
        RectangleAction rectAction = new RectangleAction();
        Triangle trShape = new Triangle(3, 4, PI / 6);
        TriangleAction trAction = new TriangleAction();
        System.out.println("Square rectangle: " + rectAction.computeSquare(rectShape));
        System.out.println("Perimeter rectangle: " + rectAction.computePerimeter(rectShape));
        System.out.printf("Square triangle: %.1f%n" , trAction.computeSquare(trShape));
        System.out.printf("Perimeter triangle: %.1f%n" , trAction.computePerimeter(trShape));
        //trAction.computePerimeter(rectShape); // ошибка компиляции
    }
}
 class TriangleAction implements IShapeAction<Triangle> {
    @Override
    public double computeSquare(Triangle shape) {
        return 0.5 * shape.getA() * shape.getB() * Math.sin(shape.getAngle());
    }
    @Override
    public double computePerimeter(Triangle shape) {
        return shape.getA() + shape.getB() + shape.getC();
    }
}
class RectangleAction implements IShapeAction<Rectangle> {
    @Override
    public double computeSquare(Rectangle shape) {
        return shape.getA() * shape.getB();
    }
    @Override
    public double computePerimeter(Rectangle shape) {
        return 2 * (shape.getA() + shape.getB());
    }
}
interface IShapeAction <T extends AbstractShape> {
    double computeSquare(T shape);
    double computePerimeter(T shape);
}
 abstract class AbstractShape {
    private double a;
    public AbstractShape(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
}
class Rectangle extends AbstractShape {
    private double b;
    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }
    public double getB() {
        return b;
    }
}
 class Triangle extends AbstractShape {
    private double b;
    private double angle; // угол между сторонами в радианах
    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }
    public double getAngle() {
        return angle;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        double c = Math.pow(super.getA(),2) + Math.pow(this.getB(),2)- 2*super.getA()*this.getB()*Math.cos(angle); // stub : вычисление по теореме косинусов
        return c;
    }
}