/*----------------------------------------------------------------------------------------------------------------------	
	NumberUtil sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util;

import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class NumberUtil {
    public static int countDigits(int val)
    {
        return val == 0 ? 1 : (int) log10(abs(val)) + 1;
    }

    public static long factorial(int n)
    {
        long result = 1;

        for (int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    public static int [] getDigits(int val)
    {
        val = Math.abs(val);
        int [] digits = new int[countDigits(val)];
        int len = digits.length;

        for (int i = 0; i < len; digits[len - 1 - i] = val % 10,  val /= 10, ++i)
            ;

        return digits;
    }

    public static int getDigitsSum(int val)
    {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return sum;
    }

    public static int getFibonacciNumber(int n)
    {
        if (n <= 0)
            return -1;

        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, val = 0;

        for (int i = 2; i < n; ++i) {
            val = prev1 + prev2;
            prev2 = prev1;
            prev1 = val;
        }

        return val;
    }



    public static int getNextFibonacciNumber(int val)
    {
        if (val < 0)
            return 0;

        int prev1 = 1, prev2 = 0, result;

        for (;;) {
            result = prev1 + prev2;
            if (result > val)
                return result;

            prev2 = prev1;
            prev1 = result;
        }
    }

    public static boolean isPalindrome(int val)
    {
        return getReverse(val) == val;
    }

    public static int getPrime(int n)
    {
        if (n <= 0)
            return -1;

        int count = 0;
        int val = 2;

        for (;;) {
            if (isPrime(val))
                ++count;

            if (count == n)
                return val;

            ++val;
        }
    }

    public static int getPowSum(int val)
    {
        int n = countDigits(val);
        int sum = 0;

        while (val != 0) {
            sum += pow(val % 10, n);
            val /= 10;
        }

        return sum;
    }

    public static int getReverse(int val)
    {
        int reverse = 0;

        while (val != 0) {
            reverse = reverse * 10 + val % 10;
            val /= 10;
        }

        return reverse;
    }


    public static boolean isArmstrong(int val)
    {
        return val >= 0 && getPowSum(val) == val;
    }

    public static boolean isEven(int val)
    {
        return val % 2 == 0;
    }


    public static boolean isHarshad(int val)
    {
        if (val <= 0)
            return false;

        return val % getDigitsSum(val) == 0;
    }

    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        int sqrtIntValue = (int) sqrt(val);

        for (int i = 11; i <= sqrtIntValue; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }

    public static boolean isOdd(int val)
    {
        return !isEven(val);
    }

    public static int max(int a, int b, int c)
    {
        return Math.max(Math.max(a, b), c);
    }

    public static int mid(int a, int b, int c)
    {
        if (a <= b && b <= c || c <= b && b <= a)
            return b;

        if (b <= a && a <= c || c <= a && a <= b)
            return a;

        return c;
    }

    public static int min(int a, int b, int c)
    {
        return Math.min(Math.min(a, b), c);
    }
}