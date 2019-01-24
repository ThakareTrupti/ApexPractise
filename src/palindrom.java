public class palindrom {
    public static void main(String[] args)
    {
        int n=129,r,s=0;
        int temp=n;
        while(n>0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
            if (s == temp)
                System.out.println("palimdrom");
            else
                System.out.println("not palimdrom");



    }
}
