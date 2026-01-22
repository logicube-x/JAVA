package IF_ELSE;
import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a number ");
        int n= sc.nextInt();
        if (n%2==0){
            System.out.println("EVEN");
        }
        else
            System.out.println("ODD");
    }
}
