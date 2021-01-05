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
        String [] birthDateInfo = birthDate.split("[/]");

        int day = Integer.parseInt(birthDateInfo[0]);
        int month = Integer.parseInt(birthDateInfo[1]);
        int year = Integer.parseInt(birthDateInfo[2]);

        return DateUtil.getDayOfWeekTR(day, month, year);
    }


}
