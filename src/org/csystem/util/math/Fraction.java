package org.csystem.util.math;

public class Fraction {
    public class Fraction {
        private int m_a;
        private int m_b;

        private static org.csystem.util.math.Fraction add(int a1, int b1, int a2, int b2)
        {
            return new org.csystem.util.math.Fraction(a1 * b2 + a2 * b1, b1 * b2);
        }

        private static org.csystem.util.math.Fraction subtract(int a1, int b1, int a2, int b2)
        {
            return add(a1, b1, -a2, b2);
        }

        private static org.csystem.util.math.Fraction multiply(int a1, int b1, int a2, int b2)
        {
            return new org.csystem.util.math.Fraction(a1 * a2, b1 * b2);
        }

        private static org.csystem.util.math.Fraction divide(int a1, int b1, int a2, int b2)
        {
            return multiply(a1, b1, b2, a2);
        }

        private static void check(int a, int b)
        {
            if (b == 0) {
                System.out.println(a == 0 ? "Indefinite" : "Undefined");
                System.exit(0); //Exception konusuna kadar sabredin
            }
        }





}
