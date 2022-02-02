class Triangle extends Shape {

    public Triangle(double width) {

        super(width);
    }

    public double computeArea() {

        return Math.sqrt(3) * Math.pow(getWidth(), 2) / 4;
    }


    public String toString() {

        return ("Equilateral triangle with sides: " + getWidth());
    }


    public void run() {

        System.out.printf("%s Area: %.2f\n", toString(), computeArea());

    }

}