package Constractor;

public class ParametarizedConstractor {
    public static void main(String[] args) {
        Student s1 = new Student("Student 1", 11, 1.1f);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.result);

        Student s2 = new Student("Student 2", 22, 2.2f);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.result);

        Student s3 = new Student("Student 3", 33, 3.3f);
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.result);
    }
}