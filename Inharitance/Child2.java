package Inharitance;

public class Child2 extends Parent{
    int c;
    Child2(int a, int c){
        super(a);
        this.c = c;
    }

    void display(){
        System.out.println("From Child2 Class");
        System.out.println("a: "+this.a+"\nc: "+this.c);
    }
}