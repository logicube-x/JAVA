package IF_ELSE;
import java.util.*;
public class profit_loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the CP");
        int cp=sc.nextInt();
        System.out.println("Enter the SP");
        int sp=sc.nextInt();
        if(cp>sp) System.out.println("LOSS "+(cp-sp));
        if (sp>cp) System.out.println("PROFIT "+(sp-cp));
        if (sp==cp) System.out.println("NO PROFIT NO LOSS");
    }
}
