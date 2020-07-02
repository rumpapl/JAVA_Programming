package Constractor;

public class DefaultConstractor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Student 1";
        s1.age = 11;
        s1.result = 1.1f;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.result);

        Student s2 = new Student();
        s2.name = "Student 2";
        s2.age = 2;
        s2.result = 2.2f;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.result);

        Student s3 = new Student();
        s3.name = "Student 3";
        s3.age = 3;
        s3.result = 3.3f;
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.result);
    }
}