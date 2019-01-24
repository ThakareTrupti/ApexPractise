package com.trupti.practise;

public class JobApplication {
        //data
        String fname;
        int yr;
        static String compname="Google";
        JobApplication()
        {

        }
        JobApplication(String fname,int yr){
            this.fname=fname;
            this.yr=yr;    //this keyword point to this mem block
        }
        void display()
        {
         System.out.println("First name :"+this.fname);
         System.out.println("Year :"+this.yr);
        }
        int getAge(){
            //local var
            int currentyr=2019;
                    return(currentyr-yr);
        }
        static void print(){
            System.out.println("Company name"+compname);
        }

}
