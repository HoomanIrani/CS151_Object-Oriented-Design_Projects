/**
 * @author Houman Irani
 * @version 1.0
 * @since 02-23-2021
 * <p>
 * Main method which instance of class Product has been created and supplied,
 * with proper data.
 * </p>
 *
 * AnimalTest class which execute the program.
 */
public class AnimalTest {

    public static void main(String[] args) {

        /**
         * Objects created for all the classes and filled with instances.
         */
        Dog dog = new Dog("Dog", "Chocolate", 7,
                "male", "villages", 20 );

        System.out.println(dog.toString());
        dog.move();
        dog.sound();
        dog.eat();
        dog.sleep();
        dog.walk();
        dog.greetHuman();
        dog.bark();
        System.out.println("");



        Cat cat = new Cat("Cat", "Maloos", 4,
                "female", "cities", 25 );

        System.out.println(cat.toString());
        cat.move();
        cat.sound();
        cat.eat();
        cat.sleep();
        cat.walk();
        cat.greetHuman();
        cat.scratch();
        System.out.println("");



        Racoon racoon = new Racoon("Racoon", "Little Rac", 2,
                "male", "forest", 11 );

        System.out.println(racoon.toString());
        racoon.move();
        racoon.sound();
        racoon.eat();
        racoon.sleep();
        racoon.scratch();
        System.out.println("");




        Animal whale = new Whale("Whale", "Chocolate", 18,
                "female", "ocean", 16 );

        System.out.println(whale.toString());
        whale.move();
        whale.sound();
        racoon.eat();
        racoon.sleep();
        racoon.scratch();
        System.out.println("");


    }

}
