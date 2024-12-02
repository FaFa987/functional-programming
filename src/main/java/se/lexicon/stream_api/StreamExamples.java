package se.lexicon.stream_api;

import se.lexicon.stream_api.model.Gender;
import se.lexicon.stream_api.model.Person;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        ex9();

    }
    // Terminal Operation: Count
    public static void ex1(){

        Stream<String> skills = Stream.of( "C#","Java","Python");
        //long count = skills.count();
        System.out.println(skills.count());
    }

    // Terminal Operation: forEach
    public static void ex2(){

        Stream<Integer> iterateNumber = Stream.iterate(0, i -> i + 1);
        iterateNumber.forEach(integer -> System.out.println(integer));
    }

    // Terminal Operation: count
    public static void ex3(){
        Person person1 = new Person(1, "Tobias", "Engberg", LocalDate.parse("1999-02-02"), Gender.MALE);
        Person person2 = new Person(2, "Marcus", "Gudmundsen", LocalDate.parse("1998-03-02"), Gender.MALE);
        Person person3 = new Person(3, "Simon", "Elbrink", LocalDate.parse("1997-01-02"), Gender.MALE);

        Stream<Person> personStream = Stream.of(person1, person2, person3);
        long count = personStream.count();
        System.out.println(count);
    }

    // Terminal Operation: Min / Max
    public static void ex4(){
        List<Integer> numbers = Arrays.asList(2, 100, 1, 12, 100000, 20000);// Arrays.asList();

        Comparator<Integer> compareWithLambda = (n1,n2) -> n1.compareTo(n2);

        Optional<Integer> optionalOfMinValue = numbers.stream().min(compareWithLambda);

        if(optionalOfMinValue.isPresent()){
            System.out.println("Min number is " + optionalOfMinValue.get());
        }else {
            System.out.println("Min number is not present");
        }
    }

    // Terminal Operation: findFirst() / FindAny
    public static void ex5(){
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Bob");

        //System.out.println(names.get(0));
        String foundName = names.stream().findFirst().orElseThrow(() -> new IllegalArgumentException("No name found"));
        System.out.println("foundName = " + foundName);

    }

    public static void ex6(){
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 13);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        boolean isAllMatch = numbers.stream().allMatch(isEven);
        System.out.println("isAllMatch = " + isAllMatch); // False

        boolean isAnyMatch = numbers.stream().anyMatch(isEven);
        System.out.println("isAnyMatch = " + isAnyMatch); // True

        boolean isNoneMatch = numbers.stream().noneMatch(isEven);
        System.out.println("isNoneMatch = " + isNoneMatch); // False


    }

    // Terminal Operation: Collect
    public static void ex7(){
        List<String> names = Arrays.asList("Niclas", "Erik", "Ulf", "Kent", "Fredrik", "Fredrik");

        long count = names.stream().distinct().count();
        long count2 = names.stream().count();
        System.out.println("count = " + count);
        System.out.println("count2 = " + count2);

        Set<String> string = names.stream().collect(Collectors.toSet());
        System.out.println("string = " + string);
    }

    // Intermediate Operation: filter()
    public static void ex8(){
        List<Integer> numbers = Arrays.asList(1, -7, 10, 26, -123, 32, 11, 7, 19);

        List<Integer> oddNumber = numbers.stream()
                .filter(n -> n % 2 !=0) // Intermediate Operation
                .filter(n -> n > 0) // Intermediate Operation
                .collect(Collectors.toList()); // Terminal Operation
        System.out.println("oddNumber = " + oddNumber);
    }

    // Intermediate Operation: skip() & limit()
    public static void ex9(){
        Stream<Integer> iterateNumber = Stream.iterate(0, i -> i + 1)
                        .skip(2)
                        .limit(10);

        iterateNumber.forEach(integer -> System.out.println(integer));

        List<String> names = Arrays.asList("Erik", "Ulf", "Niclas", "Fredrik", "Marcus", "Kent");

        names.stream()
                .skip(3)
                .limit(2)
                .forEach(s -> System.out.println(s));
    }
}
