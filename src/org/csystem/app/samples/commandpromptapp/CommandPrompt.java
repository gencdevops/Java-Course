package org.csystem.app.samples.commandpromptapp;

import java.util.Scanner;

public class CommandPrompt {
    public String [] commandStr = {"length" , "reverse" , "upper" , "lower"};
    public String prompt;
    public Scanner kb;



    public CommandPrompt(String p) {
        prompt = p;
        kb = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Komut satırına hoş geldiniz...");

        for(;;) {
            System.out.print(prompt + ">");
            String cmd = kb.nextLine().trim();
            if(cmd.equals("quit"))
                break;

            System.out.printf("(%s) %n" , cmd);
        }

    }
}
