package utils;

import java.time.Year;

import model.Date;

public class DateCheckTool {
    public static boolean isDateValid(int day, int month, int year) {
        if (day < 1) {
            return false;
        }
        if (month == 2 && day > 28) {
            return false;
        } else if (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31) {
                return false;
            }
        } else {
            if (day > 30) {
                return false;
            }
        }
        // the limit of the year will be from now to the next 1 year
        if (year < Year.now().getValue() || year > (Year.now().getValue() + 1)) {
            return false;
        }
        return true;
    }

    public static boolean isWorkingDay(Date date) {
        // Working day: monday -> friday
        // Not working day: sartuday and sunday
        // int[] months = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] numDayOfEachMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // pivot is 1/6/2024 (Sartuday), take this pivot as an original date to
        // calculate
        int numDayFromPivot = 0;
        int startMonth = 6;
        if (date.getYear() > Year.now().getValue()) {
            numDayFromPivot = 214; // from 1/6/2024 to the end of year, we have 214 days
            startMonth = 1;
        }
        while (startMonth < date.getMonth()) {
            numDayFromPivot += numDayOfEachMonth[startMonth - 1];
            startMonth++;
        }
        numDayFromPivot += date.getDay();
        numDayFromPivot %= 7;
        if (numDayFromPivot == 1 || numDayFromPivot == 2) { // == 1 is Sartuday || == 2 is Sunday
            return false;
        }
        return true;
    }

    // public static void main(String[] args) {
    // System.out.println(isWorkingDay(new Date(8, 6, 2024)));
    // System.out.println(isWorkingDay(new Date(9, 6, 2024)));
    // System.out.println(isWorkingDay(new Date(7, 6, 2024)));
    // System.out.println(isWorkingDay(new Date(10, 6, 2024)));
    // System.out.println(isWorkingDay(new Date(27, 7, 2024)));
    // System.out.println(isWorkingDay(new Date(28, 7, 2024)));
    // System.out.println(isWorkingDay(new Date(14, 2, 2025)));
    // System.out.println(isWorkingDay(new Date(15, 2, 2025)));
    // System.out.println(isWorkingDay(new Date(16, 2, 2025)));

    // }
}
