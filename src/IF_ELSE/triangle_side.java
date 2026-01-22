package IF_ELSE;
import java.util.*;
public class triangle_side {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Yes it can be a triangle");
        }
        else {
            System.out.println("no its cant");
        }
    }
}
