package threads.ThreadUsingExecuters;

public class Employee {
    private String name;
    private int age;
    private int days;
    private double salary;
    private double basicsalary;


    public Employee(String name, int age,int days,double basicsalary) {
        this.name = name;
        this.age = age;
        this.days=days;
    }

    public int getDays() {
        return days;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getdays() {
        return days;
    }
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", days=" + days +
                ", salary=" + salary +
                ", basicsalary=" + basicsalary +
                '}';
    }
}
