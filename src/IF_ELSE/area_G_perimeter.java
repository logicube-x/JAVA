package IF_ELSE;
import java.util.*;
public class area_G_perimeter {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter l:");
       int l=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        double a=l*b;
        double p=2*(l+b);
        if(a>p){
            System.out.println("area is greater ");
        }
        else {
            System.out.println("perimeter is greater");
        }
    }

}
