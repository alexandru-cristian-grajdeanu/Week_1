package org.example.capitol2;

public class LongNumberTesting {
    public static void main(String[] args) {
//        long ear = 10;
//        int hear = (int)(2 * ear);

        boolean canine = true, wolf = true;
        int teeth = 20;
        canine = (teeth != 10) ^ (wolf = false);
        System.out.println("canine=" + canine + " "  + teeth + ", wolf=" + wolf);
    }
}
