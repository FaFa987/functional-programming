package se.lexicon.stream_api;

import se.lexicon.stream_api.model.Gender;
import se.lexicon.stream_api.model.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        ex4();

    }

    public static void ex1(){

        Stream<String> skills = Stream.of( "C#","Java","Python");
        //long count = skills.count();
        System.out.println(skills.count());
    }

    public static void ex2(){

        Stream<Integer> iterateNumber = Stream.iterate(0, i -> i + 1);
        iterateNumber.forEach(integer -> System.out.println(integer));
    }

    public static void ex3(){
        Person person1 = new Person(1, "Tobias", "Engberg", LocalDate.parse("1999-02-02"), Gender.MALE);
        Person person2 = new Person(2, "Marcus", "Gudmundsen", LocalDate.parse("1998-03-02"), Gender.MALE);
        Person person3 = new Person(3, "Simon", "Elbrink", LocalDate.parse("1997-01-02"), Gender.MALE);

        Stream<Person> personStream = Stream.of(person1, person2, person3);
        long count = personStream.count();
        System.out.println(count);
    }

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
}
