package se.lexicon.stream_api;

import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        ex1();

    }

    public static void ex1(){

        Stream<String> skills = Stream.of( "C#","Java","Python");
        System.out.println(skills.count());
    }

    public static void ex2(){

    }
}
