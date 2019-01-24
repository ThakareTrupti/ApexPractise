public class SuperAsObjectex {
    public static void main(String[] args) {
        Def ob=new Def();
        ob.abc();

    }
}
class Bcd{
    int i=9;
    public void abc()
    {
        System.out.println("In Bcd class method"+i);
    }
}
class Def extends Bcd
{
    int i=5;
    public void abc()
    {
        super.abc(); //It will call Def class method
       // System.out.println("In Def class "+i);
        System.out.println("In Def class "+super.i);
    }
}