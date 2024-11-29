package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.DoubleOperator;
import se.lexicon.interfaces.StringValidator;

public class LambdaExamples {

    //Lambda as fields
    static DoStringStuff concatString = (String s1, String s2) -> {return s1 +" "+ s2;};
    static DoubleOperator addOperator = (a , b) -> a + b;
    static StringValidator notNullValidatot = (String input) -> input != null;


    public static void main(String[] args) {

        System.out.println(concatString.oparate("Fafa","khaleghi"));
        System.out.println(addOperator.apply(12d,1.5));
        System.out.println(calOperator(3.5,1.4,
                (number1 , number2) -> number1 * number2
                ));
        System.out.println(notNullValidatot.validate("Fafa"));
    }

    public static double calOperator(double n1, double n2 , DoubleOperator operator){
        return operator.apply(n1,n2);
    }
    }


