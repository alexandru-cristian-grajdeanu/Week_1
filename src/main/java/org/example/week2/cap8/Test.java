package org.example.week2.cap8;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public void remove(List<Character> list) {
        char end = 'z';
        Predicate<Character> predicate = c->{
            char start = 'a';
            return start <= c && c <= end;
        };
    }
    public static void main(String[] args) {
//        Function<Integer, Integer> s = a -> a+4;
//        Function<Integer, Integer> t = a -> a*3;
//        Function<Integer, Integer> r = s.compose(t);
//        System.out.println(r.apply(1));

        int length = 3;
        for (int i = 0; i<3; i++) {
            if (i%2 == 0) {
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get());        // B
            } else {
                int j = i;
                Supplier<Integer> supplier = () -> j;      // C
                System.out.println(supplier.get());        // D
            }
        }
    }
}
