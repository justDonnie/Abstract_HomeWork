// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape square = new Square("Square",3.5,3.5,3.5,3.5);
        System.out.println("Perimeter of square: "+square.getPerimeter());
        Shape rectangle = new Rectangle("Rectangle",2.4,3.2,2.4,3.2);
        System.out.println("Perimeter of rectangle: "+rectangle.getPerimeter());
        Shape triangle = new Triangle("Triangle",3.4,3.6,3.4);
        System.out.println("Perimeter of triangle: "+triangle.getPerimeter());
        Shape trapezoid = new Trapezoid("Trapezoid",4.4,3.5,4.5,7.9);
        System.out.println("Perimeter of trapezoid: "+trapezoid.getPerimeter());
        Shape parallelogram = new Paralellogram("Parallelogram",4.5,3.6,4.5,3.6);
        System.out.println("Perimeter of parallelogram: "+parallelogram.getPerimeter());
    }




}