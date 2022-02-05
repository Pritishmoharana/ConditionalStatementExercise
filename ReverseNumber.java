import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        int n,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            rev=n%10;
            System.out.print(rev);
            n=n/10;


        }

    }
}
