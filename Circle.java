import static java.lang.Math.PI;

//Написать класс Circle (круг) и метод, который будет возвращать его площадь.
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid data");
        }
    }

    public double measureSquare() {
        return PI*Math.pow(radius,2);
    }
}
