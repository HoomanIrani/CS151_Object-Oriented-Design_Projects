/**
 * @author Houman Irani
 * @version 1.0
 * @since 02-21-2021
 * <p>
 * Main method which instance of class Product has been created and supplied,
 * with proper data.
 * </p>
 *
 * Immutable class Product which includes final fields, getters, parameterized constructor,
 * and overrides toString method.
 */

public final class Product {

    /**
     * Attributes:
     * @param NAME (Name of the product)
     * @param DESCRIPTION (Description of the product)
     * @param PRICE (Price of the product)
     * @param MAX_QUANTITY (Maximum quantity of product available)
     */

    private final String NAME;
    private final String DESCRIPTION;
    private final double PRICE;
    private final int MAX_QUANTITY;


    /**
     * Product class parameterized constructor.
     * @param NAME
     * @param DESCRIPTION
     * @param PRICE
     * @param MAX_QUANTITY
     */
    public Product(String NAME, String DESCRIPTION, double PRICE, int MAX_QUANTITY) {

        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.PRICE = PRICE;
        this.MAX_QUANTITY = MAX_QUANTITY;
    }


    /**
     * getter method for NAME
     * @return NAME
     */
    public String getNAME(){

        return NAME;
    }

    /**
     * getter method for DESCRIPTION
     * @return DESCRIPTION
     */
    public String getDESCRIPTION(){

        return DESCRIPTION;
    }

    /**
     * getter method for PRICE
     * @return PRICE
     */
    public double getPRICE(){

        return PRICE;
    }

    /**
     * getter method for MAX_QUANTITY
     * @return
     */
    public int getMAX_QUANTITY(){

        return MAX_QUANTITY;
    }


    /**
     * overriding method toString to sort out Product data together.
     * @return
     */
    @Override
    public final String toString() {
        return "\nProduct{ " +
                "NAME = " + NAME +
                ", DESCRIPTION = " + DESCRIPTION +
                ", PRICE = " + PRICE +
                ", MAX_QUANTITY = " + MAX_QUANTITY +
                '}';
    }

}
