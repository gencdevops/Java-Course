package org.csystem.app.samples.parserapp;

import java.util.Scanner;

public class ParserApp {
    private ParserApp(){}

    public static void run() {
        Scanner kb = new Scanner(System.in);


        Parser parser = new Parser();


        for(;;) {
            System.out.println("Bir yazı giriniz : ");
            String str = kb.nextLine();

            if(str.equals("quit"))
                break;

            StringSource stringSource = new StringSource(str);

            parser.setSource(stringSource);
            parser.doParse();

        }

    }

}
