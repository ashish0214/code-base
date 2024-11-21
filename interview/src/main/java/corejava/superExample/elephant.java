package corejava.superExample;

public class elephant {
    public elephant(String name){
        System.out.println("Elephant is created by name "+name);
    }
}
 class babyelephant extends elephant{
    public babyelephant(String name,String babyname){
        super(name);
        System.out.println("Baby Elephant is created by name "+babyname);
    }
}
