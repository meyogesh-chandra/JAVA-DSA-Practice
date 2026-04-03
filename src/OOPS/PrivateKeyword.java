package OOPS;

import java.sql.SQLOutput;

class Students{
    String name;
    private int rno=67;
    double cgpa;
    void print(){
        System.out.println(name+" "+cgpa+" "+rno);
    }
    int getRno(){
        return rno; //getter
    }
    void setRno(int x){
        rno = x; //setter
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.print();
        s1.cgpa=8.9;
        s1.name="sonu";
        //s1.rno=43; //private
        s1.setRno(7);
        s1.print();
        System.out.println(s1.getRno());
    }
}
