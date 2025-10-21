package org.example.week_1.capitol4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class TestingCap4 {
    public static  void main(String[] args) {
//        var s = "Weâ€™re done feeding the animals";
//        System.out.println(s.charAt(0) + " " + s.codePointAt(0));  // W 87
//        System.out.println(s.charAt(2) + " " + s.codePointAt(2));  // â€™ 8217 ???
//        System.out.println(s.codePointBefore(3));                  // 8217 ???
//        System.out.println(s.codePointCount(0,4));                 // 4

//        int[] numbers = new int[]{3, 2, 1};
//        System.out.println(Arrays.binarySearch(numbers, 2));
//        System.out.println(Arrays.binarySearch(numbers, 3));

//        int numFish = 4;
//        String fishType = "tuna";
//        String anotherFish = numFish + 1; //cere string noi ii dam int
//        System.out.println(anotherFish + " " + fishType);
//        System.out.println(numFish + " " + 1);

//        var zone = ZoneId.of("US/Eastern");
////        var date = LocalDate.of(2028, 3, 12);
////        var date = LocalDate.of(2028, 11, 5);
////        var date = LocalDate.of(2028, 11, 6);
////        var date = LocalDate.of(2029, 2, 29); //2029 is not a leap year
////        var date = LocalDate.of(2028, MonthEnum.MARCH, 12); //ii Month nu MonthEnum
//        var time = LocalTime.of(2, 15);
//        var z = ZonedDateTime.of(date, time, zone);
//        var s = "Hello";
//        var t = new String(s);
//        if ("Hello".equals(s)) System.out.println("one");
//        if (t == s) System.out.println("two");
//        if (t.intern() == s) System.out.println("three");
//        if ("Hello" == s) System.out.println("four");
//        if ("Hello".intern() == t) System.out.println("five");
//        // Output: one three four

        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb.toString());
        // abbaccca

        double one = Math.pow(1,2);
        int two = Math.round(1.0); //cere float si ii dau double
        float three = Math.random(); //returneaza double si il stochez in float
        var doubles = new double[] {one, two, three};



    }
}
