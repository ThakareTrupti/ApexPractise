package com.trupti.practise;

public class JobApplicationTest {
    public static void main(String[] args) {
        JobApplication jobapp1=new JobApplication();
        jobapp1.fname="Ram";
        jobapp1.yr=1980;
        jobapp1.display();
        JobApplication jb2=new JobApplication("Ravana",1981);
        jb2.display();
        jb2.getAge();
        System.out.println(jb2);//It will give u memory block
        JobApplication.print();
    }
}
