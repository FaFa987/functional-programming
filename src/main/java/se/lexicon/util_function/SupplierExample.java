package se.lexicon.util_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<List<String>> init = () -> new ArrayList<>();

        List<String> list = init.get();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = Collections.emptyList();

        Supplier<String> sessionGenarator = () -> UUID.randomUUID().toString();

        System.out.println(init.get());
        System.out.println(sessionGenarator.get());
    }

}
