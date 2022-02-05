import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,c,r;
        int a=0;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            a=(r*r*r)+a;
            n=n/10;
        }
        if(c==a)
            System.out.println("armstrong number");
        else
            System.out.println("not armstrong number");

    }
}
