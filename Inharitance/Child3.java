package Inharitance;

public class Child3 extends Child2{
    int d ;
    Child3(int a, int c, int d){
        super(a, c);
        this.d = d;
    }
    void display(){
        System.out.println("From Child3 Class");
        System.out.println("a: "+this.a+"\nc: "+this.c+"\nd: "+this.d);
    }
}