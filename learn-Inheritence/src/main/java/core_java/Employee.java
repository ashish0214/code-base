package core_java;

public class Employee extends Address{

    int Id;
    String name;
    double salary;
    Address address;

    Employee(int Id,String name,double salary,String Floor_number,String Street_Name,String City_Name,String State,String Country){
        super(Floor_number,Street_Name,City_Name,State,Country);
        this.Id=Id;
        this.name=name;
        this.salary=salary;
    }






}
