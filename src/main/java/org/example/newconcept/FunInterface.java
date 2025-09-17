package org.example.newconcept;

public class FunInterface {
    public static void main(String[] args) {
        //without lambda expression
//        MyPrinter myPrinter=new MyPrinter(){
//            @Override
//            public void print(String message){
//                System.out.println("message: "+message);
//            }
//        };
//        myPrinter.print("Hello");

        //with lambda expression
        MyPrinter myPrinter=(message )-> {
            System.out.println("Message is : "+message);
        };
        myPrinter.print("Hello");
        myPrinter.show();
        MyPrinter.help(); // static method are related to class and to access that no need of object directly using interface name we can access
    }
}
//It is a marker annotation that you can apply to an interface to indicate that it is meant to be a functional interface (i.e., it should have only one abstract method).
//Yes! A functional interface can have:
//
//One abstract method ✅
//
//Any number of default or static methods ✅
@FunctionalInterface
interface MyPrinter{
    void print(String message);
//    void printb(String message); => two abstract methods are not allowed

    default void show() {
        System.out.println("Performing operation");
    }

    static void help() {
        System.out.println("This is a calculator");
    }
}