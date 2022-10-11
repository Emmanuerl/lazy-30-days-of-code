package two;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // simulate user's inputs
        var startYear = 2020;
        var n = 3;

        // since leap years have an interval of 4 years,
        // find the next leap year, increment by 4(i-1) where 0<= i < n to get the next n leap years

        var referenceStartYear = startYear+1;
        var nextLeapYear = 0;

        while(nextLeapYear == 0){
            if(isLeapYear(referenceStartYear)) nextLeapYear = referenceStartYear;
            referenceStartYear++;
        }
        var leapYears = new int[n];
        for (int i = 0; i < n; i++) leapYears[i] = nextLeapYear + 4 * i;

        System.out.println(Arrays.toString(leapYears));
    }

    public static boolean isLeapYear(int year){
        if(year % 4 != 0) return false;

        if(year % 100 != 0) return true;

        return year % 400 == 0;
    }
}
