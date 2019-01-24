interface AbInterface{
    public void showMethod();
}
class AbInterfaceImpl implements AbInterface{

    public void showMethod() {
        System.out.println("In interface implementation");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        AbInterface obi=new AbInterfaceImpl();
        obi.showMethod();


    }

}
