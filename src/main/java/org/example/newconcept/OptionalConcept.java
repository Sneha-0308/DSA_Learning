package org.example.newconcept;

import java.util.Optional;

public class OptionalConcept {
    public static void main(String[] args) {
        testing();
    }
    public static void testing(){
        /*Optional is a container object used to contain not-null objects.
         Optional is primarily used to handle the presence or absence of a
         value without explicitly checking for null. */

        //Optional.of(value) is used to create an Optional with a non-null value.
        String str="testing string";
        try{
            Optional<String> opt=Optional.of(str);
            System.out.println(opt.get());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
