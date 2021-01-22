package org.csystem.util.datetime;

public class Date {
    private static final int [] DAYS_OF_MONTHS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String [] DAYS_OF_WEEK_TR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
    private static final String [] DAYS_OF_WEEK_EN = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final String [] MONTHS_TR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
            "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
    private static final String [] MONTHS_EN = {"", "Jan", "Feb", "Mar", "Apr", "May", "JUn", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private int m_day;
    private int m_month;
    private int m_year;
    private int m_dayOfWeek;

    private static int getDayOfWeek(int day, int month, int year)
    {
        int totalDays;

        totalDays = getDayOfYear(day, month, year);

        for (int y = 1900; y < year; ++y)
            totalDays += isLeapYear(y) ? 366 : 365;

        return totalDays % 7;
    }

    private static int getDayOfYear(int day, int month, int year)
    {
        int dayOfYear = day;

        for (int m = month - 1; m >= 1; --m)
            dayOfYear += DAYS_OF_MONTHS[m];

        return month > 2 && isLeapYear(year) ? dayOfYear + 1 : dayOfYear;
    }




}
