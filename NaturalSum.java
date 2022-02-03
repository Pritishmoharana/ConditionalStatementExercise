import java.util.*;
public class NaturalnumberSum {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
            sum = sum + i;
        }
            System.out.println("sum is" + sum);


        }
    }

