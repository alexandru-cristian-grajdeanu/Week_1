package org.example.week2.cap_6;

public class Something {
    public void doNothing(){
        System.out.println("Doing nothing");
    }
    public static void doSomething(){
        System.out.println("Doing something");
    }

    public static void main(String[] args) {
        doSomething();
        new Something().doNothing();
    }
}
