package se.lexicon.functional_interfaces;

import se.lexicon.functional_interfaces.interfaces.DoStringStuff;
import se.lexicon.functional_interfaces.interfaces.DoubleOperator;

public class FunctionalExample {

    //Anonymous Inner Class
    static DoStringStuff concatString = new DoStringStuff() {

        @Override
        public String oparate(String s1, String s2) {
            return s1 +" AND "+ s2;
        }
    };

    static DoubleOperator doubleOperator = new DoubleOperator() {

        @Override
        public Double apply(double a, double b) {
            return a + b ;
        }
    };

    static DoubleOperator minusOparator = new DoubleOperator() {

        @Override
        public Double apply(double a, double b) {
            return a - b;
        }
    };

    public static void main(String[] args) {
        StringConcatenate concat = new StringConcatenate();
        System.out.println(concat.oparate("Foo", "Bar"));

        StringBiggest stringBiggest = new StringBiggest();
        System.out.println(stringBiggest.oparate("Jill", "Hamond"));

        System.out.println(concatString.oparate("Mohammad" , "Hossein"));
        System.out.println(doubleOperator.apply(23.7,51.2));
        System.out.println("Addition: " +doubleOperator.apply(50d,16d));
        System.out.println("Minus: " +minusOparator.apply(50d,16d));

        System.out.println("calOperator:" + calOperator(5000d,200d,minusOparator));


        double calValue = calOperator(41d, 32d, new DoubleOperator() {

            @Override
            public Double apply(double a, double b) {
                return a * b;
            }
        });
        System.out.println("calValue: " + calValue);


    }

    //on the fly
    public static double calOperator (Double d1 , Double d2 , DoubleOperator doubleOperator){
        return doubleOperator.apply(d1 , d2);

    }

}
