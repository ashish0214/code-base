package collection.comparable;

public class Employee implements Comparable{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //this is for sorting based on the age
//    public int compareTo(Object obj){
//        Employees emp=(Employees) obj;
//        return this.age- emp.age;
//    }


    //for comparing we use compareTo from the string class

    @Override
    public int compareTo(Object o) {
        Employee emp=(Employee) o;
        return this.name.compareTo(emp.name);
    }
}
