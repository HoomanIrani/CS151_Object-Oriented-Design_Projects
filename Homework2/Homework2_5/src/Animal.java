/**
 *
 *Animal class that is super class containing all the attributes and fields related to animals.
 */
public class Animal {

    /**
     * All the attributes:
     * @param type_Animal
     * @param name_Animal
     * @param age
     * @param gender
     * @param habitat
     * @param speed
     */
    private String type_Animal;
    private String name_Animal;
    private int age;
    private String gender;
    private String habitat;
    private double speed;


    /**
     * Animal parameterized constructor with data including:
     * @param type_Animal
     * @param name_Animal
     * @param age
     * @param gender
     * @param habitat
     * @param speed
     */
    public Animal(String type_Animal, String name_Animal, int age,
                  String gender, String habitat, double speed) {

        this.type_Animal = type_Animal;
        this.name_Animal = name_Animal;
        this.age = age;
        this.gender = gender;
        this.habitat = habitat;
        this.speed = speed;
    }

    /**
     * getter method for type_Animal
     * @return type_Animal
     */
    public String getType_Animal() {

        return type_Animal;
    }

    /**
     * setter for method type_Animal
     * @param type_Animal
     */
    public void setType_Animal(String type_Animal) {

        this.type_Animal = type_Animal;
    }

    /**
     * getter method for name_Animal
     * @return name_Animal
     */
    public String getName_Animal() {

        return name_Animal;
    }

    /**
     * setter for method name_Animal
     * @param name_Animal
     */
    public void setName_Animal(String name_Animal) {

        this.name_Animal = name_Animal;
    }

    /**
     * getter method for age
     * @return age
     */
    public int getAge() {

        return age;
    }

    /**
     * setter method for age
     * @param age
     */
    public void setAge(int age) {

        this.age = age;
    }

    /**
     * getter method for gender
     * @return gender
     */
    public String getGender() {

        return gender;
    }

    /**
     * setter method for gender
     * @param gender
     */
    public void setGender(String gender) {

        this.gender = gender;
    }

    /**
     * getter method for habitat
     * @return habitat
     */
    public String getHabitat() {

        return habitat;
    }

    /**
     * setter method for habitat
     * @param habitat
     */
    public void setHabitat(String habitat) {

        this.habitat = habitat;
    }

    /**
     * getter method for speed
     * @return speed
     */
    public double getSpeed() {

        return speed;
    }

    /**setter method for
     * @param speed
     */
    public void setSpeed(double speed) {

        this.speed = speed;
    }


    /**
     * public method for Animal movement.
     */
    public void move() {

        System.out.println("This animal moves:");
    }

    /**
     * public method for Animal sound.
     */
    public void sound() {

        System.out.println("This animal sounds:");
    }

    /**
     * public method for Animal food.
     */
    public void eat() {

        System.out.println("This animal eats:");
    }


    /**
     * public method for Animal sleep time.
     */
    public void sleep() {

        System.out.println("This animal sleeps:");
    }


    /**
     * method toString for sorting out Animal data.
     * @return
     */
    @Override
    public String toString() {
        return "\n\nAnimal{" +
                "type_Animal='" + type_Animal + '\'' +
                ", name_Animal='" + name_Animal + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", habitat='" + habitat + '\'' +
                ", speed=" + speed +
                '}';
    }

}

