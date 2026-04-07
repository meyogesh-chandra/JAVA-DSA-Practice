package Stacks;

import java.util.Stack;

public class BasicSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push("khush");
        st.push("preet");
        st.push("rish");
        st.push("isha");
        st.push("pravas");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());

    }
}
