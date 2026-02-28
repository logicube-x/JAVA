package oops;
import java.util.*;

public class basic {
    public static class  Student{
        String name;
        int en;
        double cgpa;
        void print(){
            System.out.println(name+" "+ en + " "+cgpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1 =new Student();
        s1.name="Arsh MAnsuri";
        s1.en=076;
        s1.cgpa= 8.1;

        Student s2 =new Student();
        s2.name="Arsh MAnsuri";
        s2.en=073;
        s2.cgpa= 8;

        Student s3 =new Student();
        s3.name="Arsh MAnsuri";
        s3.en=07;
        s3.cgpa= .1;

        s1.print();
        s2.print();
        s3.print();
    }

}
