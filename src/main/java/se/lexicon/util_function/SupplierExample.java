package se.lexicon.util_function;

import java.util.*;
import java.util.function.Supplier;

/**
 * Supplier<T> - T get();
 * <p>
 * Example UseCase:
 * Supply Default value
 * Generate Random Value
 * Initialize value
 */

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<List<String>> init = () -> new ArrayList<>();

        List<String> list = init.get();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = Collections.emptyList();

        Supplier<String> sessionGenarator = () -> UUID.randomUUID().toString();

        System.out.println(init.get());
        System.out.println(sessionGenarator.get());

        System.out.println(takeDecimalInput.get());
    }

    public static Supplier<Double> takeDecimalInput = () -> {

        Double number;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                number = sc.nextDouble();
                break;
            }catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }

        }
        return number;

    };

}
