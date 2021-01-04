package org.csystem.app.samples.dateapp;

public class DateUtil {
	public static int []daysOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String [] daysOfWeekTR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
	public static String [] daysOfWeekEN = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	public static String [] monthsTR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
			"Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

	public static void displayDateTR(int day, int month, int year)
	{
		int dayOfWeek;

		dayOfWeek = getDayOfWeek(day, month, year);

		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}

		System.out.printf("%d %s %04d %s%n", day, monthsTR[month], year, daysOfWeekTR[dayOfWeek]);

		System.out.println(isWeekend(day, month, year) ? "Hafta sonu geldi kurs var. Tekrar yaptınız mı?!!!" : "Hafta sonu yaklaşıyor. Tekrar yapmayı unutmayınız!!!");
	}

	public static void displayDateEN(int day, int month, int year)
	{
		int dayOfWeek;

		dayOfWeek = getDayOfWeek(day, month, year);

		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}

		System.out.printf("%02d/%02d/%04d %s%n", day, month, year, daysOfWeekEN[dayOfWeek]);
	}

	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays;

		totalDays = getDayOfYear(day, month, year);

		if (totalDays < 0)
			return -1;

		for (int y = 1900; y < year; ++y)
			totalDays += isLeapYear(y) ? 366 : 365;

		return totalDays % 7;
	}

	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;

		int dayOfYear = day;

		for (int m = month - 1; m >= 1; --m)
			dayOfYear += daysOfMonths[m];

		if (month > 2 && isLeapYear(year))
			++dayOfYear;

		return dayOfYear;
	}

	public static boolean isWeekend(int day, int month, int year)
	{
		//...
		int dayOfWeek = getDayOfWeek(day, month, year);

		return dayOfWeek == 0 || dayOfWeek == 6;
	}

	public static boolean isWeekday(int day, int month, int year)
	{
		return !isWeekend(day, month, year);
	}

	public static boolean isValidDate(int day, int month, int year)
	{
		if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900)
			return false;

		return day <= getDays(month, year);
	}

	public static int getDays(int month, int year)
	{
		return month == 2 && isLeapYear(year) ? 29 : daysOfMonths[month];
	}

	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}