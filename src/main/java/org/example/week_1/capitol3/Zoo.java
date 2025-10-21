package org.example.week_1.capitol3;

class Zoo {

    enum Animal { BIRD, FISH, MAMMAL }

    void printLocation(Animal a) {
        long type = switch (a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };

        System.out.print(type);
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.printLocation(Animal.MAMMAL);
    }
}

