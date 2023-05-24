public class Trapezoid extends Shape{
    public Trapezoid(String name, double a, double b, double c, double d) {
        super(name, a, b, c, d);
    }
    @Override
    public double getPerimeter() {
        return (getA()+getB()+getC()+getD());
    }
}
