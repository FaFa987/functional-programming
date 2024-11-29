package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.DoubleOperator;

public class LambdaExamples {

    static DoStringStuff concatString = (String s1, String s2) -> {return s1 +" "+ s2;};

    static DoubleOperator addOperator = (a , b) -> a + b;


    public static void main(String[] args) {

        System.out.println(concatString.oparate("Fafa","khaleghi"));
        System.out.println(addOperator.apply(12d,1.5));
        System.out.println(calOperator(3.5,1.4,
                (number1 , number2) -> number1 * number2
                ));
    }

    public static double calOperator(double n1, double n2 , DoubleOperator operator){
        return operator.apply(n1,n2);
    }
    }


