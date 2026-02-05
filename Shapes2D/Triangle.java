package Shapes2D;

public class Triangle extends GeometeryShapes {

    private double side1;
    private double side2;
    private double side3;
    private double angele12;
    private double  angele23;
    private double  angele13;


    Triangle(){

    }

    Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }


    @Override
    public double getPerimeter() {

        this.perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public double getPerimeter(double side1 , double side2 , double side3) {

        this.perimeter = side1 + side2 + side3;
        return perimeter;
    }


    public double getArea(double side1 , double side2 , double side3) {

        double s = (side1 + side2 + side3) / 2;
        this.area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return this.area;
    }

    public double getArea(float side1 ,  float side2 , float angele12){

        area = 0.5 * side1 * side2 * Math.cos(Math.toRadians(angele12));

        return area;

    }

    public double getArea(double base ,  double hight){

        area = 0.5 * base * hight;
        return area;
    }
}
