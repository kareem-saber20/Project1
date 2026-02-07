package Shapes3D;

public class Sphere implements HasTotalSurfaceArea, HasVolume {

    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getTotalSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
