public class ContructorOverloading {
    public static void main(String[] args)
    {
     Abc obj=new Abc(6);
    }
}
class Abc{
           Abc()
          {
              System.out.println("In Abc const without parameter");
          }
          Abc(int i)
          {
              System.out.println("In Abc constroctor integer");
          }
          Abc(int i,double j)
          {
              System.out.println("In abs constructor double");
          }

        }
