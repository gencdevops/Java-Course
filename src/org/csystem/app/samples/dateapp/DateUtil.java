package org.csystem.app.samples.dateapp;

import org.csystem.util.datetime.Date;

public class DateApp {
	private final Date m_date;

	public DateApp(int day, int month, int year)
	{
		m_date = new Date(day, month, year);
	}

	public void display()
	{
		System.out.println(m_date.toLongDateStringTR());

		System.out.println(m_date.isWeekEnd() ? "Hafta sonu geldi kurs var. Tekrar yaptınız mı?!!!" : "Hafta sonu yaklaşıyor. Tekrar yapmayı unutmayınız!!!");
	}
	//...
}