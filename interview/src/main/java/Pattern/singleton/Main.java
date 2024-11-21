package Pattern.singleton;
//To make a singleton onject we have to follow some steps like
//1 we have to restrict the call of constructor .if constructor can be called then they can create object of that
//so make the constructor as private
//2 then using a method u can restrict the creation of multiple objects
//as we can not create an object so we have to make the method as static so it can we called withod acreation of object

public class Main {
    public static void main(String[] args) {
        Singleton object1=Singleton.getInstance();
        System.out.println(object1.hashCode());

        Singleton object2=Singleton.getInstance();
        System.out.println(object2.hashCode());

        //eager Initalization
        System.out.println(EagerSingleton.getEagerSingleton().hashCode());
        System.out.println(EagerSingleton.getEagerSingleton().hashCode());
    }


}
