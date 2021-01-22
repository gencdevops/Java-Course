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

    private static boolean isValidDate(int day, int month, int year)
    {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900)
            return false;

        return day <= getDays(month, year);
    }
    private static int getDays(int month, int year)
    {
        return month == 2 && isLeapYear(year) ? 29 : DAYS_OF_MONTHS[month];
    }

    private static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void doWorkForException(String message)
    {
        System.out.println(message);
        System.exit(0); //Exception konusuna kadar sabredin
    }

    private static void checkForDate(int day, int month, int year, String message)
    {
        if (!isValidDate(day, month, year))
            doWorkForException(message);
    }

    private void checkForDay(int val)
    {
        checkForDate(val, m_month, m_year, "Invalid day value");
    }

    private void checkForMonth(int val)
    {
        checkForDate(m_day, val, m_year, "Invalid month value");
    }

    private void checkForYear(int val)
    {
        checkForDate(m_day, m_month, val, "Invalid year value");
    }

    private void set(int day, int monthValue, int year)
    {
        m_day = day;
        m_month = monthValue;
        m_year = year;
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);
    }

}
