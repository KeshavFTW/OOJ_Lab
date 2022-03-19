import java.lang.*;
abstract class Shape{
    double area;
    int dim2;
    int dim1;
    void printArea(){
        System.out.println(area);
    }
}
class Rectangle extends Shape{
    Rectangle(int length, int breadth){
        super.dim1=length;
        super.dim2=breadth;
    }
    void printArea(){
        area=dim1*dim2;
        System.out.print("Area of Rectangle : ")
        super.printArea();
    }
}
class Triangle extends Shape{
    Triangle(int base, int height){
        super.dim1=base;
        super.dim2=height;
    }
    void printArea(){
        area=dim1*dim2;
        System.out.print("Area of Triangle : ")
        super.printArea();
    }
}
class Circle extends Shape{
    Circle(int r){
        super.dim1=r;
        super.dim2=r;
    }
    void printArea(){
        area=dim1*dim2*Math.pi;
        System.out.print("Area of Circle : ");
        super.printArea();
    }
}
public class ShapeUse{
    public static void main(String[] args){
        Triangle t1=new Triangle(4,5);
        Rectangle r1=new Rectangle(10,20);
        Circle c1=new Circle(10);
        c1.printArea();
        t1.printArea();
        r1.printArea();
    }
}
