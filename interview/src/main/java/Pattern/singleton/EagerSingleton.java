package Pattern.singleton;

public class EagerSingleton {

    // doring the loading of the class we are cretaing the object
    private static EagerSingleton eagerSingleton=new EagerSingleton();

//    to get the object we should have a method
    public static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }
}
