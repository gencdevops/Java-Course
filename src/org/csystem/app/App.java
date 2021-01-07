package org.csystem.app;

import org.csystem.app.samples.commandpromptapp.CommandPromptApp;

import java.util.Random;
import java.util.Scanner;

class App {

    public static void main(String [] args) {
       Scanner kb = new Scanner(System.in);
       Random r = new Random();

        System.out.println("Satır sayısını giriniiz : ");
        int n = Integer.parseInt(kb.nextLine());

        System.out.println("Sütün sayısını giriniz : ");
        int m = Integer.parseInt(kb.nextLine());

        int [][] a;
        a = new int [n][m];





        for(int i = 0; i < a.length; i++)
            for(int j=0; j < a[i].length; j++)
                a[i][j] = r.nextInt(200);

        for(int i = 0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++)
                System.out.print(" " + a[i][j]);
            System.out.println();
            }
    }
}
