public class prime_no {
    public static void main(String[] args)
    {
        int n=11;
        boolean isPrime=true;
        for(int i=2;i<=n;i++) {
            if (n % i == 0)
                isPrime = false;
            break;
        }
        if(isPrime==true)
            System.out.println(n+ " is a prime no");
        else
            System.out.println(n+" is not a prime no");

    }
}
