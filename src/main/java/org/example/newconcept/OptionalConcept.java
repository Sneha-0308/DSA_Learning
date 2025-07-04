package org.example.newconcept;

import org.example.newconcept.model.UserDetails;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalConcept {
    public static void main(String[] args) {
        testing();
    }

    public static void testing() {
        try {
            //TODO: Optional.of(T value):

            /*Optional is a container object used to contain not-null objects.
             Optional is primarily used to handle the presence or absence of a
             value without explicitly checking for null. */

            //Optional.of(value) is used to create an Optional with a non-null value.
            //only handles null but not empty case
            String str = "testing string";
            Map<String, String> map = new HashMap<>();
            System.out.println(map);

            Optional<String> opt = Optional.of(str);
            System.out.println("String optional" + opt.get());
            Optional<Map<String, String>> optMap = Optional.of(map);
            System.out.println("Map optional" + optMap.get());

            //TODO: Optional.ofNullable(T value):
            String name=null;//""
            Optional<String> optStr=Optional.ofNullable(name);
            System.out.println("is str is present "+optStr.isPresent());//for null it will be false and for empty or any string it will be true

            //TODO: Optional.empty()
            String name1="";
            Optional<String> optname1=Optional.empty();
            System.out.println(">>is data empty method"+optname1.isPresent());
            //where this type is used is
            System.out.println(">empty method example");
            if(findUserById(0).isPresent()){
                System.out.println(findUserById(0).get());
            }else {
                System.out.println("no data found");
            }

            Optional<String> test=Optional.empty();
            System.out.println("testing empty string"+test.isPresent());// this will check value is present or not based on that it will return boolean value for empty string also it will be true and null value it will throw exception

            //TODO: ifPresent(Consumer<? super T> consumer)
            System.out.println("ifPresent(Consumer<? super T> consumer) EXAMPLE");
            Optional<String> name2=Optional.of("");
            name2.ifPresent(value -> System.out.println("value "+value));


            //TODO: orElse(T other)
            //this will check for value if it is null it will print default value else String (it can also be empty) ==because of this reason we used ofNullable() instead of of()
            Optional<String> name3=Optional.ofNullable("Sneha");
            String result=name3.orElse("default value");
            System.out.println("orElse example"+result);



            //TODO: orElseThrow(Supplier<? extends X> exceptionSupplier)
            System.out.println("orElseThrow(Supplier<? extends X> exceptionSupplier)");
            Optional<String> name4=Optional.ofNullable(null);
            try{
                String result4=name4.orElseThrow(()->new IllegalArgumentException("no value is present"));
                System.out.println(result4);
            }catch (Exception e){
                System.out.println("error->"+e.getMessage());
            }


            //TODO:ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction):
            System.out.println("example for ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction):");
            Optional<String> name5=Optional.of("sneha");
            name5.ifPresentOrElse(val -> System.out.println(val),()-> System.out.println("value is not there"));
            Optional<String> name6=Optional.empty();
            name6.ifPresentOrElse(val -> System.out.println(val),()-> System.out.println("value is not there"));


            //TODO:stream()
            System.out.println("example for stream()");
            Optional<String> name7=Optional.of("sneha");
            Stream<String> stream = name7.stream();
            stream.forEach(System.out::println);

            //TODO:or(Supplier<? extends Optional<? extends T>> supplier)
            System.out.println("example for or(Supplier<? extends Optional<? extends T>> supplier)");
            Optional<String> name8 = Optional.ofNullable(null);
            String result8 = name8.or(() -> Optional.of("default")).get();
            System.out.println("data .>"+result8);


            //TODO: isEmpty()
            Optional<String> name9 = Optional.ofNullable(null);

            System.out.println(name9.isEmpty());//false for null and true for empty string or any other string

            //TODO:chaining mechanism
            System.out.println(">..."+validateAndTransformInput("asneha").get());



            //TODO:map method in optinal: public <U> Optional<U> map(Function<? super T, ? extends U> mapper)
            Optional<String> opt3=Optional.of("sneha");
            Optional<Integer> opt3Length=opt3.map(String::length);
            opt3Length.ifPresent(System.out::println);

            //TODO:different operation in map
            Optional<String> opt4=Optional.of("      testing ");
            Optional<String> ans4=opt4.map(String::trim)
                    .map(String::toUpperCase);
            ans4.ifPresent(System.out::println);



            //TODO practical example
            System.out.println("practical example");
            UserDetails userDetails=new UserDetails("test","1234567890","testing");
            Optional<UserDetails> userDetailsOpt=Optional.ofNullable(userDetails);
            Optional<String> userName=userDetailsOpt.map(UserDetails::getName);
            userName.ifPresent(System.out::println);


            System.out.println("Array data handling");
            Optional<String> opt5=Optional.ofNullable("test1,test2,test3");
            //s is holding whole string can't do String::split its wrong
            Optional<String[]> ans5=opt5.map(s->s.split(","));
            ans5.ifPresent(data-> Arrays.stream(data).forEach(System.out::println));


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static Optional<String> findUserById(int id){
        if(id==1){
            return Optional.of(new String("Sneha"));
        }
        else {
            return Optional.empty();
        }
    }
    private static Optional<String> validateAndTransformInput(String input) {
        return Optional.ofNullable(input)
                .filter(value -> !value.isBlank()) // Check if input is not blank
                .filter(value -> value.length() > 3) // Check if input length is greater than 3
                .map(String::toUpperCase) // Transform valid input to upper case
                .filter(value -> value.startsWith("A")); // Additional validation
    }
}
