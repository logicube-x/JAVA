package BASICS;
import java.util.*;

public class three_no_sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int sum=a+b+c;

        System.out.printf("The sum of the numbers is:%d",sum);

    }
}
