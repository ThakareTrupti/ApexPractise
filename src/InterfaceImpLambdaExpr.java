public class InterfaceImpLambdaExpr {
    public static void main(String[] args) {
        AbInterface ob=()-> System.out.println("Interface implementation using lambda expression");
        ob.showMethod();
        }
}
