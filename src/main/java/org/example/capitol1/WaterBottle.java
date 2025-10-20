package org.example.capitol1;

public class WaterBottle {
    private String brand;
    private boolean empty;
    public static float code;
    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty = " + wb.empty);
        System.out.println("Brand: " + wb.brand);
        System.out.println("Code = " + code);

//        Empty = false
//        Brand: null
//        Code = 0.0

        var num1 = Integer.parseInt("11");

        var num2 = Integer.valueOf("B", 16);
//        System.out.println(num2);
        System.out.println(Integer.max(num1, num2));
    }
}
