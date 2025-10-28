package org.example.week2.cap8;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Hyena {
    private int age = 1;
    public static void main(String[] args) {
        var p  = new Hyena();
        double height = 10;
        int age = 1;
        testLaugh(p, var ->p.age <= 10);
//        testLaugh(p, shenzi -> age == 1);
        testLaugh(p, h ->h.age < 5);

        age = 2;
    }

    static void testLaugh(Hyena p, Predicate<Hyena> joke) {
        var r = joke.test(p) ? "hahaha" : "silence";
        System.out.println(r);
    }
}
