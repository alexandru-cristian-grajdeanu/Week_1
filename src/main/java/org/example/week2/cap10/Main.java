package org.example.week2.cap10;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var stream = Stream.iterate("", s -> s + "1");
//        System.out.println(stream.limit(2).map(x->x+"2"));

//        Predicate<String> predicate = s -> s.startsWith("g");
//        var stream1 = Stream.generate(()->"growl!");
//        var stream2 = Stream.generate(()->"growl!");
//        var b1 = stream1.anyMatch(predicate);
//        var b2 = stream2.allMatch(predicate);
//        System.out.println(b1 + " " + b2);

//        Predicate<String> predicate = s -> s.length()> 3;
//        var stream = Stream.iterate("-",
//                s -> ! s.isEmpty(), (s) -> s + s);
//        var b1 = stream.noneMatch(predicate);
//        var b2 = stream.anyMatch(predicate);
//        System.out.println(b1 + " " + b2);

//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int)x)
//                .boxed()
//                .collect(Collectors.groupingBy(x-> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
//        System.out.println(result);

//        var stream = LongStream.of(1, 2, 3);
//        var opt = stream.map(n -> n * 10).filter(n -> n < 5).findFirst();
////        if (opt.isPresent()) {
////            System.out.println(opt.getAsLong());
////        }
//        opt.ifPresent(System.out::println);

//        System.out.println(Stream.iterate(1, x -> ++x)
//                .limit(5).map(x -> "" + x)
//                .collect(Collectors.joining()));
//
//        Set<String> birds = Set.of("oriole", "flamingo");
//        Stream.concat(birds.stream(), birds.stream(), birds.stream());

//        List<Integer> x1 = List.of(1, 2, 3);
//        List<Integer> x2 = List.of(4, 5, 6);
//        List<Integer> x3 = List.of();
//        Stream.of(x1, x2, x3).map(x->x+1).flatMap()

//        Stream <Integer> s  = Stream.of(1);
//        IntStream intStream = s.boxed();
//        DoubleStream ds = s.mapToDouble(x -> x);
//        Stream <Integer> s2 = ds.mapToInt(x->x);
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        //var result = Stream.generate(() -> "").limit(10).filter(notEmpty).collect(Collectors.groupingBy(k->k)).entrySet().stream().map(Map.Entry::getValue).flatMap(Collection::stream).collect(Collectors.groupingBy(n->n));
        //System.out.println(result);
//        var s = DoubleStream.of(1.2, 2.4);
//        s.peek(System.out::println).filter(x-> x > 2).count();

        var spliterator = Stream.generate(() -> "x").spliterator();
        spliterator.tryAdvance(System.out::println);
        var split = spliterator.trySplit();
        split.tryAdvance(System.out::println);

    }
}
