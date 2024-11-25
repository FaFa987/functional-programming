package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringConcatenate concat = new StringConcatenate();
        System.out.println(concat.oparate("Foo", "Bar"));

        StringBiggest stringBiggest = new StringBiggest();
        System.out.println(stringBiggest.oparate("Jill", "Hamond"));


    }
}