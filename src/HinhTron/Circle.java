package HinhTron;

public class Circle {

    private double radius;
    private String color = "red";

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }
    void display() {
        System.out.println ("Hình tròn có bán kính = " + this.radius +
                            "\nDiện tích =  " + getArea());
    }
}
