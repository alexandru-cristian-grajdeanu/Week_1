package org.example.week2.cap_6;
class Arthopod{
    protected void printName(long input){
        System.out.println("Arthopod");
    }
    void printName(int input){
        System.out.println("Spooky");
    }
}
public class Spider extends Arthopod{
    protected void printName(int input){
        System.out.println("Spider");
    }
    public static void main(String[] args) {
        Arthopod a = new Spider();
        a.printName((short)4);
        a.printName(4);
        a.printName(5L);

    }
}
