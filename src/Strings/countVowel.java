package Strings;

public class countVowel {
    public static void main(String[] args) {
        String str = "Yogesh Mishra";
        int count =0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' ){
                count+=1;
            }

        }
        System.out.println(count);
    }
}
