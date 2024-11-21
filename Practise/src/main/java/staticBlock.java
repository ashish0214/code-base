public class staticBlock {
    public static void main(String[] args) {
        try{
            Demo demo=new Demo();
        }catch (Exception e){
            System.out.println("inside catch");
            System.out.println(e);
        }
    }
}
class Sample{
    static {
        int i = 1 / 0;
    }
}
class Demo extends Sample{
    static {
        System.out.println("Hello");
    }
}
