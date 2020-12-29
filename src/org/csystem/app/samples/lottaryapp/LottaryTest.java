package org.csystem.app.samples.lottaryapp;

import org.csystem.util.ArrayUtil;

import java.util.Scanner;

public class LottaryTest {
    public static void run()
    {
        Lottary lottary = new Lottary();
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Kaç kupon oynamak istersiniz?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            for (int i = 0; i < n; ++i)
                ArrayUtil.display(2, lottary.getColumn());

            System.out.println("/////////////////////");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
