package Pattern.singleton;

//Lazy initialization but not thread safe
public class Singleton {
    //making field as static because so that it can be accesed within the static method with out creatingg
//    its instance
    private  static Singleton singleton;

    //restricting construction from outside class access
    private Singleton(){
    }

    //making method as static so that without creating a instance we can access the method so that we can create an object
    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
