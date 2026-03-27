package Conditionals;

import java.util.Scanner;

public class SidesofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a >b){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }

    }
}
