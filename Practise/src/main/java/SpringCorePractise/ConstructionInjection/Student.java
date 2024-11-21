package SpringCorePractise.ConstructionInjection;

public class Student {
    int student_id;
    String name;
    Address address;

    public Student(int student_id, String name, Address address) {
        this.student_id = student_id;
        this.name = name;
        this.address = address;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
