package corejava.casting;

public class Main {
    public static void main(String []args){
        Demo d1=new Demo();
        d1.work();

        Sample s1=new Sample();
        s1.work();


        Demo d2=new Sample();
        d2.work();
        d2.done();

        Sample s2=(Sample)d2;
        s2.work();
        s2.done();


        //if the method is present in the super class and it is overriden the it will give sub class implementation
        //in only one condtion if the there is no implementation of a method that is presnt in the super class the it self it works
        //it gives super class value
    }
}
