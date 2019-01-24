//Write a program to a specified number of generate fibonacci series.
package apex.assignment;
import java.util.Scanner;

public class FebonaccySeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=1,n2=1,sum=0;
        System.out.println("Enter any value");
        int n=sc.nextInt();
        System.out.print("1 1 ");
        while(sum<=n)
        {
            if(sum>=n)
                break;;
                sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}
