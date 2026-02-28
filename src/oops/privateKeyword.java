package oops;
class Student{
    String name;
    private int en=7;
    double cgpa;
     void print(){
        System.out.println(en+" "+cgpa+" "+name);
    }
    int getRNo(){
         return en;
    }
//    public void p(){
//        print();
//    }
}
public class privateKeyword {

    public static void main(String[] args) {
        Student s1=new Student();

        s1.cgpa=76;
        s1.name="Arsh";
        System.out.println(s1.cgpa);
        System.out.println(s1.name);
//        s1.print();
        Student s2=new Student();
//        s2.print();
        System.out.println(s1.getRNo());
    }
}
