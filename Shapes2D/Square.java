package Shapes2D;

public class Square extends GeometeryShapes {

    private double side;

    Square(double side){

        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {

        this.area = side * side;
        return this.area;
    }

    @Override
    public double getPerimeter() {

        this.perimeter = 4 * side;
        return this.perimeter;
    }
}
