public class Rectangle extends Shape {

    private double length;


    public Rectangle(double width, double height) {

        super(width);
        this.length = height;
    }


    public double computeArea() {

        return getWidth() * getLength();
    }


    public double getLength() {
        return length;
    }


    public void setLength(double length) {

        this.length = length;
    }


    public String toString() {

        return ("Rectangle of Width: " + getWidth() + " Length: " + getLength());
    }


    public void run() {

        System.out.printf("%s Area: %.2f\n", toString(), computeArea());
    }
}
