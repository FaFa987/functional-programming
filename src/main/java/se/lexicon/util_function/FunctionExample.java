package se.lexicon.util_function;

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {

    /**
     * Function<T, R> - R apply(T t)
     * <p>
     * Example useCase:
     *      Transforming data
     *      Extracting data
     */

    public static void main(String[] args) {

        // 1. T - ParameterType - String
        // 2. R - Return Type - String
        Function<String , String> convertStringToUpperCase = str -> str.toUpperCase();
        System.out.println(convertStringToUpperCase.apply("Hello"));

        UnaryOperator<String> convertStringToUpperCaseUni = (str) -> str.toUpperCase();

        //1234567.89 -> "1,234,567.89"
        Function<Double , String> formatNumber = (number) -> {
            DecimalFormat df = new DecimalFormat("#,###.00");
            return df.format(number);
        };

        System.out.println(formatNumber.apply(1234567.89d));


        // 1. T - ParameterType -Integer
        // 2. U - ParameterType 2 -Integer
        // 3. R - Return Type -Integer
        BiFunction<Integer, Integer, Integer> sum = (number1, number2) -> number1 + number2;
        System.out.println(sum.apply(1, 2));


    }
}
