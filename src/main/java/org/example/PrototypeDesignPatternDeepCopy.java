package org.example;
class AddressDeep implements Cloneable{
    String city;
    AddressDeep(String city){
        this.city=city;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return new AddressDeep(city);
    }
}
class PersonDeep implements Cloneable{
    String name;
    AddressDeep addressDeep;
    PersonDeep(String name,AddressDeep addressDeep){
        this.name=name;
        this.addressDeep=addressDeep;
    }
    @Override
    protected Object clone()throws CloneNotSupportedException{
        return new PersonDeep(name,(AddressDeep) addressDeep.clone());//deep clone
    }
}
public class PrototypeDesignPatternDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonDeep p1 = new PersonDeep("John", new AddressDeep("Delhi"));
        PersonDeep p2 = (PersonDeep) p1.clone();

        p2.name = "Mike";
        p2.addressDeep.city = "Mumbai";
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.addressDeep.city);
        System.out.println(p2.addressDeep.city);

    }
}
