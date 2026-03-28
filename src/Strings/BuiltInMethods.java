package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String str = "Yogesh Mishra";
        System.out.println(str.indexOf('s'));
        System.out.println(str.lastIndexOf('s'));
        System.out.println(str.indexOf('z'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String str1 = "Harshita";
        System.out.println(str1.contains("Harsh"));
        System.out.println(str1.contains("harsh"));
        System.out.println(str1.startsWith("H"));

        String str2 = "girl";
        System.out.println(str1.concat(str2));
        System.out.println((str1.concat(str)));
    }
}
