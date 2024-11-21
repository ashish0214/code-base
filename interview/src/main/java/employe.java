import java.util.*;

public class employe {
    private int id;
    private String name;
    private double salary;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof employe employe)) return false;
        return id == employe.id && Double.compare(salary, employe.salary) == 0 && Objects.equals(name, employe.name);
    }

    public employe(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
       List<employe>ele= Arrays.asList(new employe(1,"ashish",2000.9,44),new employe(2,"rohith",2000.9,33),new employe(1,"element",20.9,56)
        ,new employe(1,"abhay",2000.9,66),
                new employe(1,"ashish",2000.9,45));

       ele.sort(Comparator.comparing(employe::getName));
       for (employe e:ele){
           System.out.println(e);
       }


        Optional<employe>ageAns=ele.stream().sorted(Comparator.comparing(employe::getAge)).skip(1).findFirst();

        System.out.println(ageAns.get().getAge());
    }
}
