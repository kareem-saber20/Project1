package Shapes2D;

public class Rectangular extends GeometeryShapes {

    private double width;
    private double height;

    Rectangular(double width, double height) {

        this.width = width;
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {

        this.perimeter = 2 * (width + height);
        return this.perimeter;

    }

    @Override
    public double getArea() {

        this.area = width * height;
        return  this.area;
    }
}
