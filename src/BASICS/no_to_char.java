package BASICS;
import java.util.*;
public class no_to_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        char ch=(char)n;
        System.out.println(ch);

        System.out.println("Enter a char:");
        char ch1=sc.next().charAt(0);
        int n1 = (int)ch1;
        System.out.println(n1);


    }

}
