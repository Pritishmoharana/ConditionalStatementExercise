import java.util.*;
public class ReadFloatingValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n;
        System.out.println("enter the number");
        n=sc.nextFloat();
        if(n==0)
        {
            System.out.println("zero");
        }
        else if(n>0 && n<1000000)
        {
            System.out.println("positive");
        }
        else if(n<0)
        {
            System.out.println("negative");
        }
        else if(n<1)
        {
            System.out.println("small");
        }
        else if(n>1000000)
        {
            System.out.println("large");
        }
        else
        {
            System.out.println("invalid number");
        }
    }
}
