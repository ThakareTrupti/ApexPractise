public class ObjectCounting {
    public static void main(String[] args) {
        A obj1=new A(); // i=1       every time contructor gets called by object i gets increased as it is static
        A obj2=new A();//i=2          static variable can hold its value outside the class where ss normal var dont
        A obj3=new A();//i=3
        A ob=new A();//i=4
        obj1.count();
        obj2.count();

    }
}
class A
        {
            static int i=0;
            A()
            {
                i++;
            }
            public void count()
            {
                System.out.println("Object count is "+i);
            }

        }
