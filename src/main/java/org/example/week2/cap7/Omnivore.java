package org.example.week2.cap7;

public interface Omnivore {
    int amount = 10;
    static boolean gather = true;
    static void eatGrass(){}
//    int findMore(){ return 5; }
    default float rest(){return 2;}
//    protected int chew(){ return 13; }
    private void eatLeaves(){}
}
