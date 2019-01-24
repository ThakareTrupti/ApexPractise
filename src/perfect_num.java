//factors of 6 equals to 6 so it is perfect no 6= 1+2+3
public class perfect_num {
    public static void main(String[] args){
        int n=7;
        boolean b=isPerfect(n);
        if(b)
            System.out.print("perfect no");
        else
            System.out.print("not a perfect no");
    }
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i<n; i++) {
            if (n%i==0)
                sum = sum+i;

        }
        if (n==sum)
            return true;

            return false;
    }
}
