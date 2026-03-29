package Strings;

public class ReverseSb {
    public static void main(String[] args) {
        String s= "Devesh";
        StringBuilder sb = new StringBuilder(s);
        sb.append("jain");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
