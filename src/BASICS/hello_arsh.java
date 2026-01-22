package BASICS;

import java.util.*;

class hello_arsh{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no= scanner.nextInt();
        int squ=no*no;
        System.out.printf("The square of the no is:%d",squ);
    }
}