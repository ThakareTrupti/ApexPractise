public class InterImpAnonymos  {
    public static void main(String[] args) {
        AbInterface ob=new AbInterface()
        {
            public void showMethod() {
                System.out.println("In Interface Method ");

            }
        };
        ob.showMethod();
    }
    public void showMethod() {

    }
}
