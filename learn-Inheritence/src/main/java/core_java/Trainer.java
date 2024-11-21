package core_java;

public class Trainer extends Employee{
    String skills;
    String certifications;

    public Trainer(int Id, String name, double salary, String Floor_number, String Street_Name, String City_Name, String State, String Country, String certifications, String skills) {
        super(Id, name, salary, Floor_number, Street_Name, City_Name, State, Country);
        this.certifications = certifications;
        this.skills = skills;
    }


}
