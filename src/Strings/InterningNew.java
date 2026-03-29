package Strings;

public class InterningNew {
    public static void main(String[] args) {
        String s1 ="Yogesh";
        String s2 = "Yogesh";
        System.out.println(s1==s2);

        String s3 = new String("Yogesh");
        String s4 = new String("Yogesh");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));//char compare
    }
}
