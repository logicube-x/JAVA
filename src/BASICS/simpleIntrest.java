package BASICS;
import java.util.*;
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        int p=sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int r=sc.nextInt();
        System.out.println("Enter the timeperiod:");
        int t=sc.nextInt();
        int si=(p*r*t/100);
        System.out.printf("The simple interest is:%d",si);
    }

}
