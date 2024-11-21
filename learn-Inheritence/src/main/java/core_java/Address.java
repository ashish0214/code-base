package core_java;

public class Address {
   private String Floor_number,Street_Name,City_Name,State,Country;

    Address(String Floor_number,String Street_Name,String City_Name,String State,String Country){
        this.Floor_number=Floor_number;
        this.Street_Name=Street_Name;
        this.City_Name=City_Name;
        this.State=State;
        this.Country=Country;
    }

    public String getCity_Name() {
        return City_Name;
    }

    public void setCity_Name(String city_Name) {
        City_Name = city_Name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFloor_number() {
        return Floor_number;
    }

    public void setFloor_number(String floor_number) {
        Floor_number = floor_number;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getStreet_Name() {
        return Street_Name;
    }

    public void setStreet_Name(String street_Name) {
        Street_Name = street_Name;
    }
}
