//program to check greatest number between three numbers
import java.util.*;
public class GreatestThree {
    public static void main(String[] args) {
         int n1,n2,n3;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter three number");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println("greater is " +n1);
            }
            else
            {
                System.out.println("greater is" +n3);
            }
        }
        else
        {
            if(n2>n3)
            {
                System.out.println("greater is" +n2);
            }
            else
            {
                System.out.println("greater is" +n3);
            }
        }

    }
}
