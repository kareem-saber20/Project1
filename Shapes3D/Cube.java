package Shapes3D;

public class Cube implements HasVolume, HasLateralSurfaceArea, HasTotalSurfaceArea {

    private double side;

    Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {

        return Math.pow(side, 3);
    }

    @Override
    public double getLateralSurfaceArea() {
        return 4 * side * side;
    }

    @Override
    public double getTotalSurfaceArea() {
        return 6 * side * side;
    }
}
