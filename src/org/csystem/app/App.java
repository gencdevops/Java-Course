package org.csystem.app;

import org.csystem.app.samples.commandpromptapp.CommandPromptApp;
import org.csystem.util.ArrayUtil;

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
        a = ArrayUtil.getRandomMatrix(r , m, n, 50,100  );


        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.printf( "%02d ", a[i][j]);
            System.out.println();
        }

    }
}
