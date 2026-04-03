package OOPS;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }

    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }

    }
    public static class Lion{
        void speak(){
            System.out.println("Grrrrrr");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }

    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        Cat c = new Cat();
        Dog d = new Dog();
        Pikachu p = new Pikachu();

        d.speak();
        c.speak();
        p.speak();
        h.speak();
    }
}
