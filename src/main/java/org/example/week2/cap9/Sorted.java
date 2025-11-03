package org.example.week2.cap9;

import java.util.Comparator;
import java.util.SequencedSet;
import java.util.TreeSet;

public record Sorted(int num, String text) implements Comparable<Sorted>, Comparator<Sorted> {
    @Override
    public int compare(Sorted o1, Sorted o2) {
        return o1.num() - o2.num();
    }

    @Override
    public int compareTo(Sorted o) {
        return text.compareTo(o.text());
    }

    @Override
    public String toString() {
        return "" + num;
    }

    public static void main(String[] args) {
        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");

        SequencedSet<Sorted> t1 = new TreeSet<Sorted>();
        t1.add(s1);
        t1.add(s2);

        var t2 = new TreeSet<Sorted>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2);
    }

}
