package oops;

public class CONSTRUCTOR {
    public  static class Car{
        int seat;
        int tyre;
        String name;
        Car(int s,int t,String n){
        seat=s;
        tyre=t;
        name=n;
        }
    }
    public static void main(String[] args) {
        Car c1=new Car(5,4,"bmw");
        System.out.println(c1.name);
    }
}
