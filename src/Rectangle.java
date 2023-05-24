public class Rectangle extends  Shape {

    public Rectangle(String name, double a, double b, double c, double d)
    {
        super(name, a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        return (2*(getA()+getB()));
    }
}
