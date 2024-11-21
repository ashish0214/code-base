package SpringCorePractise.ConstructionInjection;

import java.util.List;
import java.util.Map;

public class Address {
    String street,city,state;
    List<Integer> pincode;
    Map<Integer,String> codes;


    public Address(String street, Map<Integer, String> codes, List<Integer> pincode, String state, String city) {
        this.street = street;
        this.codes = codes;
        this.pincode = pincode;
        this.state = state;
        this.city = city;
    }

    public List<Integer> getPincode() {
        return pincode;
    }

    public void setPincode(List<Integer> pincode) {
        this.pincode = pincode;
    }

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", codes=" + codes +
                '}';
    }
}
