package se.lexicon.util_function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<Integer>();

        for (int i = -10; i <= 20; i++) {
            number.add(i);
        }
        System.out.println(number);

        Predicate<Integer> isPositive = i -> i > 0;
        Predicate<Integer> isOdd = i -> i % 2 != 0;

        /*for (Integer i : number) {
            if (isPositive.test(i)) {
                System.out.println(i);
            }
        }*/
        System.out.println(filterNumbers(number, isPositive));
        System.out.println(filterNumbers(number, isPositive.and(isOdd)));
        System.out.println(filterNumbers(number, isPositive.negate()));

    }

    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (predicate.test(number)) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }
}
