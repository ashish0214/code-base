package org.example;

public class inheritance {
    public static void main(String[] args) {
//        B b=new B();
//        b.eat(25);
        A a=new A();
        System.out.println(a.eat(34));


    }

}
class A{
    Number eat(int a){
        System.out.println("1st class");
        return 24.7;
    }


}
class B extends  A{
//we can return number integer long etc
Integer eat(int a){
    System.out.println("the overriden method");
return 25;
}

    void done(int a,int b){
        System.out.println("class2");
    }

}
