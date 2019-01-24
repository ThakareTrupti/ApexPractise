package com.trupti.practise;

public class InterfaceEx {
    public static void main(String[] args) {
        B b=new B();
        b.test();
        b.display();
        System.out.println(Aaa.temp);

    }

}
class AA{
    void display(){
        System.out.println("Inside TT");
    }
}

interface Aaa{
    int temp=23; // public static final
    void test();  // public abstract


}
class B extends AA implements Aaa{

    public void test() {
        System.out.println("Inside com.trupti.practise.B");

    }
}