package org.example.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
//        SequencedCollection<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
//        SequencedCollection<Integer> tigers = new CopyOnWriteArrayList<>(lions);
//        Set<Integer> bears = new ConcurrentSkipListSet<>();
//        bears.addAll(lions);
//        for(Integer item : tigers){
//            tigers.add(4);
//        }
//        for(Integer item : bears){
//            bears.add(5);
//        }
//        System.out.println(lions.size() + " " + tigers.size() + " " + bears.size());
        Integer i1 = List.of(1, 2, 3, 4, 5).stream().findAny().get();
        synchronized (i1) {
            Integer i2 = List.of(6, 7, 8, 9, 10).parallelStream().sorted().findAny().get();
            System.out.println(i1 + " " + i2);
        }

    }
}
