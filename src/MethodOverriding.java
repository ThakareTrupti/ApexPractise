public class MethodOverriding {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.show();


    }
}
class Par{
    public void show()                //Methods with same name types n parameter in parent base n subclass called overriding
    {
        System.out.println("In class Parent");
    }
}
class Child extends Par{
    public void show()
    // methood overriding, dynamic binding, late binding , method overriding,Run-time polymorphism
    {
      System.out.println("In class Child");
    }
}
