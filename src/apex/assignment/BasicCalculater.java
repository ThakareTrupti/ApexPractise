/*Write a class BasicCalulator.java to provide basic mathematical operation like
additional, subtractions, multiplications, and division for two numbers. Write a client
to use above class and call its operations.*/
package apex.assignment;

import java.util.Scanner;

public class BasicCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter two no ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        BasicCalculater obj = new BasicCalculater();
        obj.add(n1, n2);
        obj.div(n1,n2);
        obj.mul(n1,n2);
        obj.sub(n1,n2);
    }

    public void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("Sum of two no " + sum);

    }
    public void sub(int n1, int n2) {
        int sub = n1 - n2;
        System.out.println("Subtraction of two no " + sub);

    }
    public void mul(int n1, int n2) {
        int mul = n1 * n2;
        System.out.println("Multiplication of two no " + mul);

    }
    public void div(int n1, int n2) {
        int div = n1 / n2;
        System.out.println("Division of two no " + div);

    }
}
