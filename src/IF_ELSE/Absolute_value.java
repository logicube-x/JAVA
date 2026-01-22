package IF_ELSE;
import java.util.*;
public class Absolute_value {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        if(n<0) n=-n;
        System.out.println(n);
    }
}
