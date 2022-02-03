import java.util.*;
public class CubeNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("enter an integer");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
            System.out.println("the cube is" +(i*i*i));
        }
    }