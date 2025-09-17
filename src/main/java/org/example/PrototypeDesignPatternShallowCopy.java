package org.example;

class Address{
    String city;
    Address(String city){
        this.city=city;
    }
}
class Person implements Cloneable{
    String name;
    Address address;
    Person(String name,Address address){
        this.name=name;
        this.address=address;
    }
    @Override
    protected  Object clone()throws CloneNotSupportedException{
        return super.clone(); //shallow copy
    }
}
public class PrototypeDesignPatternShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1=new Person("John",new Address("Delhi"));
        Person p2=(Person) p1.clone();
        p2.name="Mike";
        p2.address.city="Mumbai";
        System.out.println(p1.name);//shallow copy works fine in non nested item
        System.out.println(p2.name);
        System.out.println(p1.address.city);//shallow copy won't work in non nested item
        System.out.println(p2.address.city);

    }
}
