package exception.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExInpupOutputData {
    public static void main(String[] args) throws Exception  {

        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            String s="";

             s=br.readLine();




        }
       
    }
}
