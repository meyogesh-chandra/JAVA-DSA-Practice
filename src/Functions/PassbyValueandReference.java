package Functions;

public class PassbyValueandReference {
    public static void change(int x){
        x = 6;
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
