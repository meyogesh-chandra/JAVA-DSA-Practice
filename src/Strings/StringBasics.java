package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
       char[] arr ={ 'y','o','g','e','s','h'};
       for(char ele : arr){
           System.out.print(ele +" ");
       }

       String str = "she is a girl and he is boy";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        String t = sc.next();
        System.out.println(t);
    }
}
