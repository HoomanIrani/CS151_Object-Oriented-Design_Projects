public class Address {


    private int streetNum;
    private String streetName;
    private String city;
    private String zipCode;
    private String state;



    public Address(int streetNum, String streetName, String city, String zip, String state) {

        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        zipCode = zip;
        this.state = state;
    }



    public int getStreetNum() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        zipCode = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString() {
        return streetNum + " ," + streetName + " ," + city + " ," + zipCode +

                " ," + state + "\n";
    }

}