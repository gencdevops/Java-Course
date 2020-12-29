/*----------------------------------------------------------------------------------------------------------------------
	ArrayUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import java.util.Random;

public class ArrayUtil {
    public static void display(int [] a)
    {
        display(1, a);
    }

    public static void display(int n, int [] a)
    {
        display(' ', '\n', n, a);
    }

    public static void display(char sep, char end, int [] a)
    {
        display(sep, end, 1, a);
    }

    public static void display(char sep, char end, int n, int [] a)
    {
        String fmt = String.format("%%0%dd%%c", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i], sep); //n -> 2 -> "%02d%c"

        System.out.print(end);
    }

    public static void fillArrayRandom(Random r, int [] a, int min, int max)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(max - min) + min;
    }

    public static void fillArrayRandom(int [] a, int min, int max)
    {
        fillArrayRandom(new Random(), a, min, max);
    }

    public static int [] getRandomArray(Random r, int n, int min, int max) //[min, max)
    {
        int [] a = new int[n];

        fillArrayRandom(r, a, min, max);

        return a;
    }

    public static int [] getRandomArray(int n, int min, int max) //[min, max)
    {
        return getRandomArray(new Random(), n, min, max);
    }

    public static int max(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.max(result, a[i]);

        return result;
    }

    public static int min(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.min(result, a[i]);

        return result;
    }

    public static void reverse(int [] a)
    {
        int halfLen = a.length / 2;

        for (int i = 0; i < halfLen; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static void shuffle(int [] a, int n)
    {
        shuffle(new Random(), a, n);
    }

    public static void shuffle(Random r, int [] a, int n)
    {
        for (int i = 0; i < n; ++i) {
            int firstIndex, secondIndex;

            do {
                firstIndex = r.nextInt(a.length);
                secondIndex = r.nextInt(a.length);
            } while (firstIndex == secondIndex);

            swap(a, firstIndex, secondIndex);
        }
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}
