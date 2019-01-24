import java.util.ArrayList;

public class WrapperClass
{
    public static void main(String[] args) {
        int i=5;
        Integer ii=new Integer(i); //Boxing
        Integer jj=i; // AutoBoxing


        int j=jj.intValue();       //unboxing
        int k=jj;                  // Autoboxing

        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(3);
        values.add(5);


    }
}
