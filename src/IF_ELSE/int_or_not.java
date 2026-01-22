package IF_ELSE;
import java.util.*;
public class int_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double dn= sc.nextDouble();
        int n=(int)dn;
        if(dn-n>0){
            System.out.println("DECIMAL");
        }
        else{
            System.out.println("NOT DECIMAL");
        }
    }
}



