public class StringSplitting {
    public static void main(String[] args) {
    String s="Trupti , Maithili , Sandip ,Avanti"  ;
    String a[]=s.split(",");                    //split by ","
        System.out.println(a[1]);                   //If we wanyt Maithili name spesify index no
        for(String str:a)
        {
            System.out.println(" "+str);            //All string names after splitting by ,
        }
    }
}
