package exception.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionD {
    public static void main(String[] args) {
        int i=5,j=2,s ;
        int a[]=new int[4];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            j=Integer.parseInt(br.readLine());
            s=i/j;
            /*for(int k=0;k<=4;k++)
            {
                a[k]=k+1;
                System.out.println(a[k]);
            }
            for(int val:a)
            {
                System.out.println(val);
            }*/
        }
        catch (IOException ie){
            System.out.println("Some IO Exception "+ie);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not divide by zero "+ e);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex);
        }
        finally {
            System.out.println("Bye");

        }
    }
}
