public class ToStringDemo {
    public static void main(String[] args) {
        Demo d= new Demo();
        System.out.println(d);

    }
}
class Demo
{
    int rollNo=101;
    String name="Trupti";
    @Override
    public String toString() {
        return "Demo{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }


}
