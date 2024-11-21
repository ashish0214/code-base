package SpringCorePractise;

public class Address {
    String city,street,state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String city, String street, String state) {
        this.city = city;
        this.street = street;
        this.state = state;
    }
    Address(){

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
