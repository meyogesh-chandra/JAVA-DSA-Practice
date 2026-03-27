package loops;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        int flag=0;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num%i ==0){
                flag=1;
            }
        }
        if(flag == 0){
            System.out.println("Its Prime");
        }else {
            System.out.println("Composite");
        }
    }
}
