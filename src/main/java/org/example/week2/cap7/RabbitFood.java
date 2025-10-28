package org.example.week2.cap7;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
//    public RabbitFood(){
////        throw new RuntimeException();
////        size = MAX_STORAGE;
//
//    }

}
