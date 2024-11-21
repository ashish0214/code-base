package methodReference;

public class Main {
    static void display() {
        System.out.println("i am the don");
    }

    void mismatch(Integer a, Integer b) {
        System.out.println("integer b:" + a + "int a:" + b);
    }

    Main() {
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        //method with no parameters
        //static method reference

        TaskCompetion task = Main::display;//method display is assigned
        task.apply();
        //method with parameters
        //method reference using instance
        Main main = new Main();
        BiConsumer biConsumer = main::mismatch;
        biConsumer.display(2, 7);

        //constructor reference
        Constructor constructor = Main::new;
        constructor.constructorIntialization();

    }


}
