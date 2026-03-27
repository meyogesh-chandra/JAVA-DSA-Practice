package Conditionals;


import java.util.Scanner;

public class ternaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println((val%2==0)? "Even" :"odd");

    }
}
