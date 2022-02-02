/**
 * Here I created a custom Exception called TooManyHoursWorkedException.
 */
public class TooManyHoursWorkedException extends Exception {

    /**
     * parameterized constructor for our custom exception.
     * @param s
     */
    public TooManyHoursWorkedException(String s) {

        super(s);
    }
}
