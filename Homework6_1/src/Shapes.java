import java.util.ArrayList;

public class Shapes {

    ArrayList<Shape> shapeList;

    public Shapes() {

        shapeList = new ArrayList<>();
    }

    public Shapes(ArrayList<Shape> shapeList) {

        this.shapeList = shapeList;
    }



    public void add(Shape shp) {

        shapeList.add(shp);
    }



    public void remove(Shape shp) {

        shapeList.remove(shp);
    }



    public ArrayList<Shape> getShapeList() {

        return shapeList;
    }



    public void setShapeList(ArrayList<Shape> shapeList) {

        this.shapeList = shapeList;
    }


    synchronized public void compute() {

        System.out.println("Shape List:");

        for (Shape shape : shapeList) {
            shape.start();
        }
    }



    public Shape max() {
        double maxArea = 0;
        Shape maxShape = null;
        for (Shape sh : shapeList) {
            if (sh.computeArea() >= maxArea) {
                maxArea = sh.computeArea();
                maxShape = sh;
            }
        }
        return maxShape;
    }



    public Shape min() {
        double minArea = shapeList.get(0).computeArea();
        Shape minShape = null;
        for (Shape sh : shapeList) {
            if (sh.computeArea() < minArea) {
                minArea = sh.computeArea();
                minShape = sh;
            }
        }

        return minShape;
    }

}