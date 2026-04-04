package OOPS;

import java.sql.SQLOutput;

public class RevisionOOPS {
    private static class Pokemon{
        int hp;
        int speed;
        int attack;
        int defence;
        String type;
        String name;
        int power;
        Pokemon(String type,int power){
            this.power=power;
            this.type=type;

        }
        Pokemon(){

        }
        void print(){
            System.out.println(this.power+" "+this.type);
        }
    }
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric",70);
        Pokemon p1 = new Pokemon();
        p1.name ="Pikachu"; p1.type="Electric"; p1.attack=70;
        Pokemon p2 = new Pokemon();
        p2.name = "charizard"; p2.type="fire"; p2.attack = 110;
        Pokemon p3 = p1; //p3 is shalllow copy of p1
        p3.type = "water";
        System.out.println(p1.type);
        pikachu.print();

    }
}
