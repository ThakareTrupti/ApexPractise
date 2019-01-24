/* 153= cube of 1,5,3 sum equals to 153
         1*!*1=1
         5*5*5=125
         3*3*3=9
         1+125+9=153
 */

public class Armstrong_num {
    public static void main(String[] ar)
    {
        int n=13;
        int r,sum=0;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(temp==sum)
            System.out.print("It is an Armstrong no");
            else
                System.out.print("Its not an Armstrong no");


    }
}
