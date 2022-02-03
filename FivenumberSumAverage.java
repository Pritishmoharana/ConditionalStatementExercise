import java.util.*;
public class FivenumberSumAverage {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("enter five number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        System.out.println("sum is" +(a+b+c+d+e));
        System.out.println("average is" +((a+b+c+d+e)/5));
    }
}
