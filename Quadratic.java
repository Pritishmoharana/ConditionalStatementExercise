import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("enter value for a");
        System.out.println("enter value for b");
        System.out.println("enter value for c");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double root1;
        double root2;
        double d=(b*b)-(4*a*c);
        if(d==0) {

            root1 = -b / (2 * a);
            root2 = -b / (2 * a);
            System.out.println("root1=" + root1);
            System.out.println("root2=" + root2);
        }
        else if(d<0) {
            System.out.println("roots are imaginary");
        }
        else if(d>0) {
            System.out.println("root1=" + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println("root2=" + (-b - Math.sqrt(d)) / (2 * a));
        }
            else
        System.out.println("no roots");


    }
}
