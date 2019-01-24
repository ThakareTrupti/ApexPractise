import java.util.Random;

public class RandomClass_Arrey {
    public static void main(String[] args)
    {
        int a[]=new int[30];
        Random r=new Random();
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt(34);


        }
        System.out.println(24); // will start from 24 element
        for(int i:a)
        {
            System.out.println(i);
        }
    }
}
