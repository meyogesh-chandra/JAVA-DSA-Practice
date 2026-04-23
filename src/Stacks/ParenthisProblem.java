package Stacks;

import java.util.Stack;

public class ParenthisProblem {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "[()()]{}";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch == '[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) {System.out.println("false");
                return;
                }

                if (ch==')'){
                    char temp = st.peek();
                    if(temp=='(') st.pop();
                    else System.out.println("false");;
                }
                else if(ch=='}'){
                    char temp = st.peek();
                    if(temp=='{') st.pop();
                    else System.out.println("false");
                }
                else{
                    char temp = st.peek();
                    if(temp=='[') st.pop();
                    else System.out.println("false");
                }
            }
        }
        System.out.println(st.size()==0);
    }
}
