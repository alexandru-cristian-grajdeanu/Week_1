package org.example.week2.cap7;

record Gorilla(int x, Double y) {
    Gorilla{}
    Gorilla(){
        this(1, 2.0);
    }
}

record Family(Gorilla parent1, Gorilla parent2) {}

public class Test{
    public static void main(String[] args) {
        var family = new Family(new Gorilla(1, null), new Gorilla(0, 1.2));
        System.out.print(
                switch (family){
                    case Family(var a, var b) -> "1";
//                    case Family(Gorilla c, Gorilla (int d, double e)) -> "2";

                }
        );
    }

}
