package se.lexicon;

import se.lexicon.interfaces.*;

import java.util.Random;
import java.util.regex.Pattern;

public class LambdaExamples {

    //Lambda as fields
    static DoStringStuff concatString = (String s1, String s2) -> {return s1 +" "+ s2;};

    static DoubleOperator addOperator = (a , b) -> a + b;

    static StringValidator notNullValidatot = (String input) -> input != null;

    static StringValidator mobileValidator = (String mobileNumber) -> mobileNumber != null && Pattern.compile("^\\d{10}$").matcher(mobileNumber).matches();

    static Printer printMessage = (String message) -> System.out.println(message);


    public static void main(String[] args) {

        System.out.println(concatString.oparate("Fafa","khaleghi"));
        System.out.println(addOperator.apply(12d,1.5));

        System.out.println(calOperator(3.5,1.4,
                (number1 , number2) -> number1 * number2
                ));
        System.out.println(notNullValidatot.validate("Fafa"));

        System.out.println(mobileValidator.validate("123456894856")); // False
        System.out.println(mobileValidator.validate("0731234556"));// True

        printMessage.print("HELLO AGAIN");

        IntRandom generateRandomInt = () -> new Random().nextInt();
        int randomIntHere = generateRandomInt.generate();
        System.out.println(randomIntHere);
    }

    public static double calOperator(double n1, double n2 , DoubleOperator operator){
        return operator.apply(n1,n2);
    }
    }


