package Shapes3D;

public class RectangularPrism implements HasLateralSurfaceArea, HasTotalSurfaceArea, HasVolume {

    private double width;
    private double height;
    private double length;


    RectangularPrism(double width, double length, double height) {

        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getLateralSurfaceArea() {

        return 2 * height * (length + width);
    }

    @Override
    public double getTotalSurfaceArea() {

        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double getVolume() {

        return width * length * height;
    }
}
