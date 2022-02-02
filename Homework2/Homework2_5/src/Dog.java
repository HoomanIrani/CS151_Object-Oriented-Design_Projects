/**
 * Dog class which is sub class of Animal and implements interface Domesticated.
 */
public class Dog extends Animal implements Domesticated {

    /**
     * Parameterized constructor that have attributes:
     * @param type_Animal
     * @param name_Animal
     * @param age
     * @param gender
     * @param habitat
     * @param speed
     */
    public Dog (String type_Animal, String name_Animal, int age,
               String gender, String habitat, double speed) {

        super(type_Animal, name_Animal, age, gender, habitat, speed);
    }

    /**
     * overriding method move and define it for dog.
     */
    @Override
    public void move(){

        super.move();
        System.out.println("Fast!\n");
    }

    /**
     * overriding method sound and define it for dog.
     */
    @Override
    public void sound() {

        super.sound();
        System.out.println("huff!\n");
    }

    /**
     * overriding method eat and define it for dog.
     */
    @Override
    public void eat() {

        super.eat();
        System.out.println("bone!\n");
    }

    /**
     * overriding method sleep and define it for dog.
     */
    @Override
    public void sleep() {

        super.sleep();
        System.out.println("10 hours per day!\n");
    }

    /**
     * overriding method walk and define it for dog.
     */
    @Override
    public void walk() {

        System.out.println("They like to walk with humans.\n");
    }

    /**
     * overriding method greetHuman and define it for dog.
     */
    @Override
    public void greetHuman() {

        System.out.println("They great humans they know.\n");
    }

    /**
     * Dog exclusive method bark()
     */
    public void bark() {

        System.out.println("Dogs bark when they are hungry or don't know someone!\n");
    }


}
