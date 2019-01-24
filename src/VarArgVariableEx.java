public class VarArgVariableEx {
    public static void main(String[] args)
    {
        DisplaySow obj=new DisplaySow();
        obj.show(2,3,4,5);

    }
}
class DisplaySow{
    public void show(int ...a) //Vararg variable argument
    {
      for(int i:a)
      {
          System.out.println(i);
      }
    }
}