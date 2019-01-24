public class StaticBlock {
    static String s="";
    static// static method always executes first b4 main method
    {
        System.out.println("In static 1 block");

    }
    static
    {
        s="It is static var";// we can not use const here(const only works for instance var) to initialize static var we need static block
    }

    public static void main(String[] args) {
        System.out.println("Hello "+s);

    }
    static
        {
          System.out.println("In Static 2");
        }

}
