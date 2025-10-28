package org.example.week2.cap8;

import java.util.function.Predicate;

public class Fantasy {
    public static void scary(String animal){
        Predicate<String> dino = s -> "dino".equals(animal);
//        var dragon = s-> "dragon".equals(animal);
    }
}
