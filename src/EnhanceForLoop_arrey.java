public class EnhanceForLoop_arrey {
    public static void main(String[] args)
    {
        int a[]=new int [5];
        //1,2,3,4,5  values
        //0,1,2,3,4 index no
        for(int i=0;i<a.length;i++) {
            a[i] = i + 1; // It will give 1 , 2, 3, 4, 5  arrey values/elements
            }
        for(int i:a) // for(int value: arrey name)
        {
            System.out.println(i); //It will fetch the values from arrey
        }
    }
}
