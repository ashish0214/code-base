package Autowiring.usingAnnotation;

public class Employe {
    private Address address;
    public Employe(){}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employe( Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employe{" + '\'' +
                ", address=" + address +
                '}';
    }
}
