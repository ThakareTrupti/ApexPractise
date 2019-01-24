import java.util.Scanner;

public class StrOperation {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two String : ");
        s1=sc.nextLine();
        s2=sc.nextLine();
        String s=s1.concat(s2);
        System.out.println("Concatination of two string " +s);
        int l1=s1.length();
        int l2=s2.length();
        System.out.println("Length of two strings "+l1+" "+l2);
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        System.out.println("InUpper case "+s1 +" "+s2);
    }

}
