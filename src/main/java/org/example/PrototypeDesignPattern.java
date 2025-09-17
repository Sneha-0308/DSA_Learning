package org.example;

interface Prototype extends Cloneable{
    Prototype clone();
}
class Employee implements Prototype{
    private String name;
    private String role;
    public Employee(String name,String role){
        this.name=name;
        this.role=role;
    }
    @Override
    public Prototype clone(){
        return new Employee(name,role);
    }
    @Override
    public String toString(){
        return "Employee{name='" + name + "', role='" + role + "'}";
    }
}
public class PrototypeDesignPattern {
    public static void main(String[] args) {
        Employee original =new Employee("John","Developer");
        Employee copy = (Employee) original.clone();
        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);    }

}
