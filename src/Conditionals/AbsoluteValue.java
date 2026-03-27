package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value :");
        int value = sc.nextInt();
        if(value >= 0){
            System.out.println(value);
        }else{
            System.out.println(-value);
        }
    }
}
