public class ternaryOp {
    public static void main(String[] args) {
        int i=4;
         int j=5;
        /*
        if(i==1)
             j=6;
         else
             j=7;*/
        j= i==1?6:7;
         System.out.println(j);
         Object obj1;
         Object obj2;
         if(true)
             obj1= 10;
         else
             obj1= 20.0;
         System.out.println(obj1);
         obj2=true?(Integer) obj1:(Double) 25.0;
         System.out.println(obj2);




    }
}
