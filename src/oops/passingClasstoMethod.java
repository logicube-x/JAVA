package oops;

public class passingClasstoMethod {
    public static class Car{
        int seat;
        String name;
        double length;
        void print(){
            System.out.println(seat+" "+length+" "+name);
        }

    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length=37;
        c.name="bmw";
        c.seat=5;
        change(c);
        System.out.println(c.seat);
        c.print();


    }
    private static void change(Car x){
        x.seat=4;
    }
}
