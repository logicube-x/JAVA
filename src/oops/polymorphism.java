package oops;

public class polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhav Bhav");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow");
        }
    }

    public static class Pikachu{
        void speak() {
            System.out.println("pika pika");
        }
    }

    public static class Human{
        void speak() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Human h1=new Human();
        Pikachu p1=new Pikachu();
        Dog d1=new Dog();
        Cat c1=new Cat();

        d1.speak();
        c1.speak();
        p1.speak();
        h1.speak();

    }


}
