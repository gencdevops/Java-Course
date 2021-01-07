package org.csystem.app.samples.examsimulationapp;

import org.csystem.util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    public String lectureName;
    public int [][] grades;
    public double [] averages;
    public double average;

    public void fillGrades()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.printf("%s sınavına girecek şube sayısını giriniz:", lectureName);
        grades = new int[Integer.parseInt(kb.nextLine())][];
        averages = new double[grades.length];

        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d. şube öğrenci sayısını giriniz:", i + 1);
            int count = Integer.parseInt(kb.nextLine());

            grades[i] = ArrayUtil.getRandomArray(r, count, 0, 101);
        }
    }

    public void findAverages()
    {
        int totalNumberStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < grades.length; ++i) {
            int total = ArrayUtil.sum(grades[i]);

            averages[i] = (double)total / grades[i].length;
            totalGrades += total;
            totalNumberStudents += grades[i].length;
        }

        average = (double)totalGrades / totalNumberStudents;
    }

    public ExamSimulation(String name)
    {
        lectureName = name;
    }

    public void run()
    {
        fillGrades();
        findAverages();
    }

    public void displayGrades()
    {
        System.out.printf("%s dersinin sınav notları:%n", lectureName);
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d. şube sınav notları:", i + 1);
            ArrayUtil.display(3, grades[i]);
        }
        System.out.println("----------------------------------------------------------------");
    }

    public void displayResults()
    {
        displayGrades();
        System.out.printf("%s dersi için ortalamalar:%n", lectureName);
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < averages.length; ++i)
            System.out.printf("%d. şubenin ortalaması:%f%n", i + 1, averages[i]);

        System.out.printf("Okul ortalaması:%f%n", average);
        System.out.println("----------------------------------------------------------------");
    }



}
