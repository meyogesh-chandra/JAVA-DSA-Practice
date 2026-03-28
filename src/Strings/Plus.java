package Strings;

public class Plus {
    public static void main(String[] args) {
        String s = "bhakti";
        s=s+"sakti hi";
        s+=10;
        s+='\n';
        s+='n';
        System.out.println(s);
        System.out.println("sonu"+10+20);//left to right associative
        System.out.println(10+20+"sonu");
        System.out.println(10+"sonu"+20);
        System.out.println('A'+2+"sonu");
    }
}
