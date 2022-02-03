import java.util.*;
public class MulTable {
    public static void main(String[] args) {
        int n;
        System.out.println("enter an integer");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+ "*"+ i+ "="+(n*i));
        }
    }
}
