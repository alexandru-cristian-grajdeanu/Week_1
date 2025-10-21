//package org.example.week_1.capitol3;
//
//public class Testing2 {
//    enum DayOfWeek {
//
//        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
//
//        private DayOfWeek getWeekDay(int day, final int thursday) {
//            int otherDay = day;
//            int Sunday = 0;
//
//            switch (otherDay) {
//                default:
//                case 1:
//                    continue; //aici nu merge
//                case thursday:
//                    return DayOfWeek.THURSDAY;
//                case 2, 10:
//                    break;
//                case Sunday:
//                    return DayOfWeek.SUNDAY;
//                case DayOfWeek.MONDAY: //nu ajunge aici
//                    return DayOfWeek.MONDAY;
//            }
//
//            return DayOfWeek.FRIDAY;
//        }
//    }
//
//}
