package org.csystem.app.samples.studentinfoapp;

import java.util.Scanner;

public class StudentInfoParserApp {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        for(;;) {
            System.out.println("Formatlı yazıyı giriniz");
            String str = kb.nextLine();

            StudentInfoParser studentInfoParser = new StudentInfoParser(str);

            System.out.println(studentInfoParser.studentInfo.toString());

            if("quit".equals(str))
                break;
        }
    }
}
