package org.example.week_1.capitol5;

public class MainClass {

    final double number = 5;
    public static void newNumber(int num) {
        num += 10;
    }

    public void oboe(String[] values, int... nums){

    }
    public void moo(int m, int... n){

    }
    public void moo(int... cx){

    }



    public int juggle(boolean b, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {
//        int num = 4;
//        newNumber(num);
//        System.out.println(num);
        var b = new MainClass();
        System.out.println(b.juggle(true, new boolean[2]));


    }
}
