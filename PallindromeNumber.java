import java.util.*;
public class PallindromeNumber {
    public static void main(String[] args) {
        int n,r,s=0;
        int c;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("pallindrome number");
        }
        else
        {
            System.out.println("not pallindrome number");
        }

    }
}
