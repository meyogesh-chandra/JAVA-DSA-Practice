package OOPS;

public class Constructor {
    public static class Car{
        int seats;
        String name;
        double length;
        Car(){//default constructor

        }
        Car(int x, String s,double d){// parameterised constructor
            seats = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }

    }
    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia sonet",3.99);
        System.out.println(c1.name);

        Car c2 = new Car(5,"Honda City",4.55);
        c2.print();

    }
}
