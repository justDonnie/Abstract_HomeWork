public abstract class Shape {
    private String name;
    private double a;
    private double b;
    private double c;
    private double d;


    public Shape(String name, double b, double c) {
        this.name = name;
        this.b = b;
        this.c = c;
    }

    public Shape(String name, double b, double c, double d) {
        this.name = name;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Shape(String name, double a, double b, double c, double d) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Shape() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    public abstract double getPerimeter();

}

