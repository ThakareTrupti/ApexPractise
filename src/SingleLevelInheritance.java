public class SingleLevelInheritance {
    public static void main(String[] args) {
        Multi obj =new Multi();
        obj.n1=9;
        obj.n2=5;
        obj.sub();
        obj.add();
        obj.mul();

    }
}
class Add
{
    int n1,n2,result=0;
    public void add()
    {
        result=n1+n2;
        System.out.println("Sum "+result);
    }

}
class AddSub extends Add{        //single level inheritance
    public void sub()
    {
        result=n1-n2;
        System.out.println("Sub "+result);
    }
}
class Multi extends AddSub{            //MultiLevel inheritance
    public void mul()
    {
        result=n1*n2;
        System.out.println("Multiplication "+result);
    }
}