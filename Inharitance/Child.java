package Inharitance;

public class Child extends Parent {
    int b;
    Child(int a, int b){
        super(a);
        this.b = b;
    }

    void display(){
        System.out.println("a: "+this.a+"\nb: "+this.b);
    }
}