import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y;
        System.out.println("enter the year");
        y=sc.nextInt();
        if(y%4==0)
        {
            System.out.println("it is a leapyear");
        }
        else
        {
            System.out.println("not a leapyear");
        }

    }

}
