package org.example.week2.cap_6.mammal1;

public class Mammal {
    private void eat(){}
    protected static void drink(){}
    public Integer dance(String p){return null;}
}

class Primate extends Mammal{
    public void eat(String p){}
}

class Monkey extends Primate{
    public static void drink() throws RuntimeException{}
    public Number dance(CharSequence p){return null;}
//    public int eat(String p){}
}
