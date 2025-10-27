package org.example.week2.cap_6;
class Mammal{
    private void sneeze(){}
    public Mammal(int age){
        System.out.println("Mammal");
    }
}

public class Platypus extends Mammal {
    int sneeze(){return 1;}
    public Platypus(){
        super(2);
        System.out.println("Platypus");
    }
    public static void main(String[] args) {
        new Mammal(5);
    }
}
