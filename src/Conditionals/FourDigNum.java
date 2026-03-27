package Conditionals;

import java.util.Scanner;

public class FourDigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        if(n > 999 && n<10000){
            System.out.println("4 Digit Num");
        }else{
            System.out.println("Not 4 Digit");
        }
    }
}
