public class MarkerIntEx {
    public static void main(String[] args) {
     MarkerShow obj=new MarkerShow();
     if(obj instanceof MarkerInt)
         obj.show();
     else
         System.out.println("No Interface ");

    }
}
class MarkerShow implements MarkerInt{
    public void show(){
        System.out.println("In Marker Show Method");
    }

}