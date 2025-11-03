package org.example.week2.cap9;

import java.util.*;

public class Testing {

    public static <T>  T identity(T t) {
        return t;
    }
    public static void main(String[] args) {
//        List<?> q = List.of("mouse", "parrot");
//        var v = List.of("mouse", "parrot");
//
////        q.removeIf(String::isEmpty);
////        q.removeIf(s -> s.isEmpty());
//
//        v.removeIf(String::isEmpty);
//        v.removeIf(s -> s.isEmpty());

//        var greeting = new ArrayDeque<String>();
//        greeting.offerLast("hello");
//        greeting.offerLast("hi");
//        greeting.offerFirst("ola");
//        greeting.pop();
//        greeting.peek();
//        while(greeting.peek() != null){
//            System.out.print(greeting.pop());
//        }

//        HashSet<? super ClassCastException> hs = new HashSet<Exception>();
////        List<Objects> values = new ArrayList<? extends Objects>();
//
//        Map<String, ? extends Number> hm = new HashMap<String, Integer>();

//        var list = List.of(1, 2, 3);
//        var set = Set.of(1, 2, 3);
//        var map = Map.of(1, 2, 3, 4);
//
//        list.forEach(System.out::println);
//        set.forEach(System.out::println);
//        map.keySet().forEach(System.out::println);
//        map.values().forEach(System.out::println);
//        Map m  = new HashMap();
//        m.put(123, "456");
//        m.put("abc", "def");
//        System.out.println(m.contains("123"));

//        var map = Map.of(1, 2, 3,6);
//        var list = List.copyOf(map.entrySet());
//
//        List<Integer> one = List.of(8, 16, 2);
//        var copy = List.copyOf(one);
//        var copyOfCopy = List.copyOf(copy);
//        var thirdCopy = List.copyOf(copyOfCopy);
//
////        list.replaceAll(x -> x * 2);
//        one.replaceAll(x -> x * 2);
//        thirdCopy.replaceAll(x -> x * 2);
//
//        System.out.println(thirdCopy);
//        var map = new HashMap<Integer, Integer>();
//        map.put(1, 10);
//        map.put(2, 20);
//        map.put(3, null);
//        map.merge(1, 3, (a,b) -> a + b);
//        map.merge(3, 3, (a,b) -> a + b);
//        System.out.println(map);

//        SequencedMap<Integer, String> cats = new TreeMap<>();
//        cats.put(3, "Snowball");
//        cats.put(2, "Sugar");
//        cats.put(1, "Minnie Mouse");
//
//        cats.pollFirstEntry();
//        var id = cats.lastEntry().getKey();
//        cats.pollFirstEntry();
//        System.out.println(cats.firstEntry().getValue());

        var fishes = new TreeSet<String>();
        fishes.add("Koi");
        fishes.addFirst("clown");
        fishes.add("carp");
        for (String fish : fishes) {
            System.out.print(fish + ", ");
        }
    }

}
