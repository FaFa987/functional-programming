package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.DoubleOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    //Anonymous Inner Class
    static DoStringStuff concatString = new DoStringStuff() {

        @Override
        public String oparate(String s1, String s2) {
            return s1 +" AND "+ s2;
        }
    };

    static DoubleOperator doubleOperator = new DoubleOperator() {

        @Override
        public Double additionOperat(double a, double b) {
            return a + b ;
        }
    };

    static DoubleOperator minusOparator = new DoubleOperator() {

        @Override
        public Double additionOperat(double a, double b) {
            return a - b;
        }
    };


    public static void main(String[] args) {

        StringConcatenate concat = new StringConcatenate();
        System.out.println(concat.oparate("Foo", "Bar"));

        StringBiggest stringBiggest = new StringBiggest();
        System.out.println(stringBiggest.oparate("Jill", "Hamond"));

        System.out.println(concatString.oparate("Mohammad" , "Hossein"));
        System.out.println(doubleOperator.additionOperat(23.7,51.2));
        System.out.println("Addition: " +doubleOperator.additionOperat(50d,16d));
        System.out.println("Minus: " +minusOparator.additionOperat(50d,16d));


    }
}