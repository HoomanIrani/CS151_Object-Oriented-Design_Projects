import java.util.logging.Level;
import java.util.logging.Logger;

public class ShapeTest {

    public static void main(String[] args) {

                Shapes sh = new Shapes();

                sh.add(new Triangle(10));
                sh.add(new Triangle(5.5));
                sh.add(new Circle(8.4));
                sh.add(new Circle(13));
                sh.add(new Rectangle(10, 20));
                sh.add(new Rectangle(8, 13));
                sh.add(new Hexagon(18.5));
                sh.add(new Hexagon(7.0));
                sh.compute();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ShapeTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("\nMax:\n" + sh.max().toString());
                System.out.println("\nMin:\n" + sh.min().toString());
            }
        }