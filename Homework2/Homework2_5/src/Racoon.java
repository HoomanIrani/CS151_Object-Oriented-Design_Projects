/**
 * sub class Racoon which implements Scratcher interface.
 */
public class Racoon extends Animal implements Scratcher {

    /**
     * Parameterized constructor including data:
     * @param type_Animal
     * @param name_Animal
     * @param age
     * @param gender
     * @param habitat
     * @param speed
     */
    public Racoon (String type_Animal, String name_Animal, int age,
                String gender, String habitat, double speed) {

        super(type_Animal, name_Animal, age, gender, habitat, speed);
    }

    /**
     * Overriding method move and define it for Racoon.
     */
    @Override
    public void move(){

        super.move();
        System.out.println("Slow!\n");
    }

    /**
     * Overriding method sound and define it for Racoon.
     */
    @Override
    public void sound() {

        super.sound();
        System.out.println("Sheee!\n");
    }

    /**
     * Overriding method eat and define it for Racoon.
     */
    @Override
    public void eat() {

        super.eat();
        System.out.println("vegetables!\n");
    }

    /**
     * Overriding method sleep and define it for Racoon.
     */
    @Override
    public void sleep() {

        super.sleep();
        System.out.println("15 hours per day!\n");
    }

    /**
     * Overriding method scratch and define it for Racoon.
     */
    @Override
    public void scratch() {

        System.out.println("They have sharp nails for scratching and climbing trees.\n");
    }


}

