package core_java;
import java.util.Scanner;

public class Task5 {
    void logic( String day,int k){
        String week_days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int num=0;
        for(int i=0;i<week_days.length;i++){
            if(day.equalsIgnoreCase(week_days[i])){
                num=i;
            }
        }
        num+=k;
        num%=7;
        System.out.println(week_days[num]);

    }

    public static void main(String[] args) {
        Task5 m1=new Task5();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current date");
        String day=sc.next();
        System.out.println("Enter the days after to shedule");
        int NumberOfDays=sc.nextInt();
        m1.logic(day,NumberOfDays);

    }
}
