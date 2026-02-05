package Shapes2D;

public class Circle extends GeometeryShapes {

    private double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return this.radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        this.area = Math.PI * radius * radius;
        return this.area;
    }

    @Override
    public double getPerimeter() {

        this.perimeter = 2 * Math.PI * radius;
        return this.perimeter;
    }
}

