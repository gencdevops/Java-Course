package org.csystem.app.samples.studentinfoapp;

import org.csystem.app.samples.dateapp.DateUtil;

public class StudentInfo {
    public String name;
    public String birthDate;
    public String lectureName;
    public int midtermGrade;
    public int finalGrade;

    public double getGrade() {
        return midtermGrade * 0.4 + finalGrade * 0.6;
    }

    public String getBirthDateStr() {
        String [] birthDateInfo =birthDate.split("[/]");

        int day = Integer.parseInt(birthDateInfo[0]);
        int month = Integer.parseInt(birthDateInfo[1]);
        int year = Integer.parseInt(birthDateInfo[2]);
        String monthStr =  DateUtil.getMonthTR(month);
        return String.format("%d %s %d %s" , day , monthStr, year, DateUtil.getDayOfWeek(day, month, year));
    }

    public String toString() {
        double grade = getGrade();

        return String.format("%s %s %f %s" , name , getBirthDateStr(), grade , grade > 50 ? "Başarılı" : "Başarısız");
    }


}
