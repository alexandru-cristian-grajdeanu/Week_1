package org.example.week2.cap_6;

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() {
        this(2);
        call = false;
//        this(2); surprinzator si asta merge
    }
    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }
    private static void printBirdSeed() {
        System.out.println("Bird Seed");
    }

    public static void  main(String[] args) {
        var birdSeed = new BirdSeed();
        System.out.println(birdSeed.numberBags);
        printBirdSeed();
    }
}
