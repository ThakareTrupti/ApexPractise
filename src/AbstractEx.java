public class AbstractEx {
    public static void main(String[] args) {
        Trupti obj=new Trupti19();
        obj.call();
        obj.dance();obj.move();
        obj.text();


    }
}
 abstract class Trupti{
    public void call()
    {
        System.out.println("Calling...");
    }
    public abstract void move();
    public abstract void text();
    public abstract void dance();
 }
abstract class Trupti14 extends Trupti
 {
     @Override
     public void dance() {
         System.out.println("Dancing...");
     }
 }
 class Trupti19 extends Trupti14
 {
     @Override
     public void text() {
         System.out.println("texting");
     }

     @Override
     public void move() {
         System.out.println("Moving...");
     }
 }