class Circle extends Shape {

    public Circle(double width) {

        super(width);
    }

    public double computeArea() {
        return Math.PI * Math.pow(getWidth(), 2);
    }

    public String toString() {
        return ("Radius of Circle: " + getWidth());
    }


    public void run() {
        System.out.printf("%s Area: %.2f\n", toString(), computeArea());


    }
}