public class Triangle extends  Shape{
    public Triangle(String name, double a, double b, double c) {
        super(name, a, b, c);
    }


    @Override
    public double getPerimeter() {
        return (getB()+getC()+getD()) ;
    }
}

