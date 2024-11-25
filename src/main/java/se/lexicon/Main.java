package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;

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


    public static void main(String[] args) {

        StringConcatenate concat = new StringConcatenate();
        System.out.println(concat.oparate("Foo", "Bar"));

        StringBiggest stringBiggest = new StringBiggest();
        System.out.println(stringBiggest.oparate("Jill", "Hamond"));

        System.out.println(concatString.oparate("Mohammad" , "Hossein"));


    }
}