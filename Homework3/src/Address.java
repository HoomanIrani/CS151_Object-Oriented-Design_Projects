/**
 * Address class has been created as a composition to our next class Person and holds components of address,
 * in U.S. format.
 */

public class Address {

    /**
     * Private attributes for Address class.
     * @param streetNum
     * @param streetName
     * @param city
     * @param zip
     * @param state
     */

    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;

    /**
     * Our parameterized constructor of Address class.
     * @param streetNum
     * @param streetName
     * @param city
     * @param zip
     * @param state
     */


    public Address(int streetNum, String streetName, String city, String zip, String state) {

        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }


    /**
     * All the getter and setter methods created as part of object oriented design,
     * for Address class.
     */

    public int getStreetNum() {

        return streetNum;
    }

    public void setStreetNum(int streetNum1) {

        this.streetNum = streetNum1;
    }

    public String getStreetName() {

        return streetName;
    }

    public void setStreetName(String streetName) {

        this.streetName = streetName;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getZip() {

        return zip;
    }

    public void setZip(String zip) {

        this.zip = zip;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }


    /**
     * Overriding toString method to print out address as a proper format.
     * @return
     */

    @Override
    public String toString() {
        return streetNum +" " +streetName +", " +city +", " +zip +", " +state +".";
    }
}
