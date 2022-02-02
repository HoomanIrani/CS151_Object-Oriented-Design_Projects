/**
 * sub class Cat which implements Domisticated and Scratcher interfaces.
 */
public class Cat extends Animal implements Domesticated, Scratcher {

    /**
     * Parameterized constructor including data:
     * @param type_Animal
     * @param name_Animal
     * @param age
     * @param gender
     * @param habitat
     * @param speed
     */
    public Cat (String type_Animal, String name_Animal, int age,
                String gender, String habitat, double speed) {

        super(type_Animal, name_Animal, age, gender, habitat, speed);
    }

    /**
     * Overriding method move and define it for Cat.
     */
    @Override
    public void move() {

        super.move();
        System.out.println("Really fast!\n");
    }

    /**
     * Overriding method sound and define it for Cat.
     */
    @Override
    public void sound() {
        System.out.println("Meow!\n");
    }

    /**
     * Overriding method eat and define it for Cat.
     */
    @Override
    public void eat() {

        super.eat();
        System.out.println("meat!\n");
    }

    /**
     * Overriding method sleep and define it for Cat.
     */
    @Override
    public void sleep() {

        super.sleep();
        System.out.println("14 hours per day!\n");
    }

    /**
     * Overriding method walk and define it for Cat.
     */
    @Override
    public void walk() {

        System.out.println("They like to walk by themselves.\n");
    }

    /**
     * Overriding method greetHuman and define it for Cat.
     */
    @Override
    public void greetHuman() {

        System.out.println("They don't normally greet humans.\n");
    }

    /**
     * Overriding method scratch and define it for Cat.
     */
    @Override
    public void scratch() {

        System.out.println("They have sharp nails for eating meat.\n");
    }


}


