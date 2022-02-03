import java.util.*;
public class IncreasingDecreasing {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter three number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a<b)&&(a<c)&&(b<c))
            System.out.println("increasing");
        else if((a>b)&&(a>c)&&(b>c))
            System.out.println("decreasing");
        else
            System.out.println("neither increasing nor decreasing");
    }
}
S