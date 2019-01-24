public class StaticMethodVarEx {
    public static void main(String[] args) {
        Abcd.i=6;
        Abcd.Show();
    }
}
class Abcd{
    static int i;
    public static void Show()
    {
        System.out.println("In Show method & var " +i);
    }


}