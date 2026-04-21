package Heap;
import java.util.*;
class Student implements Comparable<Student>{
    int rno;
    String name;
    double cgpa;
    Student(String name,int rno, double cgpa){
        this.name = name;
        this.rno=rno;
        this.cgpa=cgpa;
    }
    public int compareTo(Student s){
        return this.rno - s.rno;
    }

}
public class customComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Gopi",200,8.3);
        Student s2 = new Student("sonu",49,9);
        Student s3 = new Student("vikash",8,8.5);
        Student s4 = new Student("isha",90,8.3);
        Student s5 = new Student("aditya",31,9.7);
        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);// sort based on rno
        for(Student s : arr){
            System.out.println(s.name+" "+s.rno);
        }
    }
}
