package com.trupti.practise;

public class HasRelationEx {
    public static void main(String[] args) {
        Address ad=new Address("Sunnyvale");
        Emp e=new Emp("Trupti",ad);

    }
}
class Address{
    String cityName;
    public Address(String cityName){
        super();
        this.cityName=cityName;
    }
    public String toString(){
        return super.toString();
    }
}
class Emp{
    String name;
    Address address;
    public Emp(String name,Address ad)
    {
       super();
       this.name=name;
       this.address=ad;
    }


}