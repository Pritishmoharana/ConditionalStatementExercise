import java.util.*;
public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ms;
        int i;
        System.out.println("enter the monthly sales");
        ms = sc.nextInt();
        if (ms >= 50000)
            System.out.println("income is" + (575 + (ms * 0.16)));
        else if ((ms <= 50000) && (ms >=40000))
            System.out.println("income is" +(550+(ms*0.14)));
        else if ((ms < 40000) && (ms >=30000))
            System.out.println("income is" +(525+(ms*0.12)));
        else if ((ms < 30000) && (ms >=20000))
            System.out.println("income is" +(500+(ms*0.09)));
        else if ((ms < 20000) && (ms >=10000))
            System.out.println("income is" +(450+(ms*0.05)));
        else if ((ms < 10000))
            System.out.println("income is" +(400+(ms*0.03)));
        else
        System.out.println("no income");




    }
}
