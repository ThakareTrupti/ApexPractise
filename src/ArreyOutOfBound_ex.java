import java.util.Random;

public class ArreyOutOfBound_ex {
    public static void main(String[] ar) {
        int a[] = new int[35];
        Random r = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt(35);
        }
        try {
            System.out.println(a[52]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Maximum Index is 34");
        }
        for(int i : a)
        {
            System.out.println(i);
        }
    }
}
