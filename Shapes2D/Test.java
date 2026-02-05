package Shapes2D;

public class Test {
    public static void main(String[] args) {

//        Circle c1 = new Circle(5);
//
//        System.out.println("Area: " + c1.getArea() + " permiter: " + c1.getPerimeter());
//
//        Square s1 = new Square(2);
//
//        System.out.println("Area: " + s1.getArea() + " permiter: " + s1.getPerimeter());
//
//        Rectangular r1 = new Rectangular(2, 5);
//
//        System.out.println("Area: " + r1.getArea() + " permiter: " + r1.getPerimeter());

        Triangle t1 = new Triangle(2 , 4 ,6 );

        System.out.println("Area: " + t1.getArea( 5.0 , 4, 6)+ " Permiter: " + t1.getPerimeter());

    }
}
