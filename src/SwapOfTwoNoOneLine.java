public class SwapOfTwoNoOneLine {
    public static void main(String[] args) {


        int first = 8, second = 19;
        first = (first += second) - (second = first - second);

        System.out.println("a "+first +" b "+second);

    }
}
