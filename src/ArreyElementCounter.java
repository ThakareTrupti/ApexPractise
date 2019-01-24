import java.util.Random;

public class ArreyElementCounter {
    public static void main(String[] args) {
        Random r=new Random();
        int a[] = new int[7];
        for(int i=1;i<1000;i++){
            ++a[1+r.nextInt(6)];
        }
        System.out.println("j\ta[]");
        for(int j=1;j<a.length;j++)
        {
            System.out.println(j+"\t"+a[j]);
        }
    }
}
