import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputRead {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=" ";
        String str=" ";
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        s=b.readLine();
        System.out.println("Hello "+s);
        //With Scanner class if you want to print string
        str=sc.nextLine();
        System.out.println(" hi "+str);
        //If you want to print Integer
        int i=Integer.parseInt(sc.nextLine());
        System.out.println(" Hello with int ip "+i);
       /* int i=System.in.read();
        System.out.println((char)i);
        String s=" ";
        while((i=System.in.read())!= 48)
        {
            s=s+(char)i;

        }
        System.out.println(s);
    */


    }
}
