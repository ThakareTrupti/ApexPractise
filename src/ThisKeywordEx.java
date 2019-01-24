import java.sql.SQLOutput;

public class ThisKeywordEx {
    public static void main(String[] args) {
    ThisEx obj=new ThisEx(9);
    obj.show();
    }
}
class ThisEx {
    private int a;
    public ThisEx(int a)
    {
       this.a=a;

    }
    public void show()
    {
        System.out.println("Var value "+a);
    }
}
