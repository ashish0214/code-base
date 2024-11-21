package core_java;

public class Software_Engineer extends Employee{
    String Project_Name;

    public Software_Engineer(int Id, String name, double salary, String Floor_number, String Street_Name, String City_Name, String State, String Country, String project_Name) {
        super(Id, name, salary, Floor_number, Street_Name, City_Name, State, Country);
        Project_Name = project_Name;
    }


}
