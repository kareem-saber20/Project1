package Shapes3D;

public class Test {

    public static void main(String[] args) {

        Cube c1 = new Cube(2);

        System.out.println("V = " + c1.getVolume() + " LSA = " + c1.getLateralSurfaceArea() + " TSA = " + c1.getTotalSurfaceArea());

        Sphere s1 = new Sphere(2);

        System.out.println("V = " + s1.getVolume() + " TSA = " + s1.getTotalSurfaceArea());

        RectangularPrism r1 = new RectangularPrism(2, 3, 5);

        System.out.println("V = " + r1.getVolume() + " LSA = " + r1.getLateralSurfaceArea() + " TSA = " + r1.getTotalSurfaceArea());


    }
}
