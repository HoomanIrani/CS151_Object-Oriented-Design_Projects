/**
 * Sub class Whale that implements Swimmer interface.
 */
public class Whale extends Animal implements Swimmer {

    /**
     * Parameterized constructor with data:
     * @param type_Animal
     * @param name_Animal
     * @param age
     * @param gender
     * @param habitat
     * @param speed
     */
    public Whale (String type_Animal, String name_Animal, int age,
                   String gender, String habitat, double speed) {

        super(type_Animal, name_Animal, age, gender, habitat, speed);
    }

    /**
     * Overriding method move() and define it for Whale.
     */
    @Override
    public void move(){

        super.move();
        System.out.println("fast in water!\n");
    }

    /**
     * Overriding method sound() and define it for Whale.
     */
    @Override
    public void sound() {

        super.sound();
        System.out.println("Oooooo!\n");
    }

    /**
     * Overriding method eat() and define it for Whale.
     */
    @Override
    public void eat() {

        super.eat();
        System.out.println("Fish!\n");
    }

    /**
     * Overriding method sleep() and define it for Whale.
     */
    @Override
    public void sleep() {

        super.sleep();
        System.out.println("2 hours per day!\n");
    }

    /**
     * Overriding method swim() and define it for Whale.
     */
    @Override
    public void swim() {

        System.out.println("Whales swim most of their times.\n");

    }


}

