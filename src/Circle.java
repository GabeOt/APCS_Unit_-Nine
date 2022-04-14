public class Circle extends Shape{

    private double radius;

    public Circle() {
        super();
        radius=10.0;
    }


    public Circle(double r, String c, boolean f){
        super(c,f);
        radius = r;
        setColor(c);
        setFilled(f);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI + Math.pow(radius, 2);
    }

    public double getCircumference(){
        return Math.PI*2*radius;
    }

    public double getDiameter(){
        return radius*2;
    }

    public String toString(){
        return "The circle has a radius of " + radius + " " + super.toString();
    }

}
