package Constractor;

public class Student {
    String name;
    int age;
    float result;

    Student(){} //default constractor

    Student( String name, int age, float result) // parametarized constractor
    {
        this.name = name;
        this.age = age;
        this.result = result;
    }
}