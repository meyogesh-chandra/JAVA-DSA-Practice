package OOPS;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="sonu";
        s1.rno = 23;
        s1.cgpa = 8.3;

        Student s2 =new Student();
        s2.name="lavish";
        s2.rno = 24;
        s2.cgpa = 4.3;

        Student s3 =new Student();
        s3.name="anafortan";
        s3.rno = 43;
        s3.cgpa = 8.3;

        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        s2.cgpa=4.1;
        System.out.println(s2.cgpa);
    }
}
