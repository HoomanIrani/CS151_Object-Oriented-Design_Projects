class Hexagon extends Shape {

    public Hexagon(double width) {

        super(width);
    }


    public double computeArea() {

        return (3 * Math.sqrt(3) * Math.pow(getWidth(), 2) / 2);
    }


    public String toString() {

        return ("Hexagon with sides of: " + getWidth());
    }


    public void run() {

        System.out.printf("%s Area: %.2f\n", toString(), computeArea());
    }
}