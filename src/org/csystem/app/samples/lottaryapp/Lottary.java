package org.csystem.app.samples.lottaryapp;

import java.util.Random;

public class Lottary {
    public Random random;

    public static int [] getNumbers(boolean [] flags)
    {
        int [] a = new int[6];
        int index = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                a[index++] = i;

        return a;
    }

    public boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int val;

            for (;;) {
                val = random.nextInt(49) + 1;
                if (!flags[val])
                    break;
            }
            flags[val] = true;
        }

        return flags;
    }

    public Lottary()
    {
        random = new Random();
    }

    public int[] getColumn()
    {
        return getNumbers(getFlags());
    }
}
