public class Abstract2Demo {
    public static void main(String[] args) {
        Phone iob=new Iphone();
        Phone sob=new Samsung();
        show(iob);
        show(sob);
    }
    public static void show(Phone obj){    // obj of subclass n ref of super class
        obj.showConfig();
    }
}
abstract class Phone
{
    abstract public void showConfig();
}
class Iphone extends Phone
{
        public void showConfig()
        {
        System.out.println("Iphone");

    }
}
class Samsung extends Phone
{
    public void showConfig()
    {
        System.out.println("Samsung");
    }
}