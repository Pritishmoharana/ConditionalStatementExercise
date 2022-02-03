//program to take a number and check whether positive or negative
 import java.util.*;
public class PositiveNegative {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("positive number");
        }
        else
        {
            System.out.println("negative number");
        }
    }
}
