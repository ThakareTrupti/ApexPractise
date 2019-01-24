import java.util.Scanner;

public class febonacci_series {
    public static void main(String[] args )
    {
        int n1=1,n2=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any value");
        int n=sc.nextInt();
        System.out.print("1 1 ");
        while(sum<=n) {
            if(sum>=n)
                break;
            sum = n1 + n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
        }


    }
}