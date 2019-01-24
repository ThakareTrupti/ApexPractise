public class MethodOverloading {
    public static void main(String[] args) {
        Ac ob=new Ac();
        ob.show();
        ob.show(7);
        ob.show(100);
        ob.show("trupti",5);

    }
}
class Ac{
    public void show()                    //method overloading same method name with diffrent  no of parameter,data types
    {
        System.out.println("Hello inShow");
    }
    public void show(int i)
    {
        System.out.println("Hello inShow int" +i);
    }
    public void show(double i)
    {
        System.out.println("Hello inShow double "+i);
    }
    public void show(String s,int i)
    {
        System.out.println("Hello inShow String "+ s+" "+i);
    }
}