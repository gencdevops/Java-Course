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

        public void simplify()
        {
            int min = Math.min(Math.abs(m_a), m_b);

            for (int i = min; i >= 2; --i)
                if (m_a % i == 0 && m_b % i == 0) {
                    m_a /= i;
                    m_b /= i;
                    break;
                }
        }
        private void configureSign()
        {
            if (m_b < 0) {
                m_a = -m_a;
                m_b = -m_b;
            }
        }

        private void set(int a, int b)
        {
            if (a == 0) {
                m_a = 0;
                m_b = 1;
                return;
            }

            m_a = a;
            m_b = b;
            configureSign();
            simplify();
        }

        public Fraction()
        {
            m_b = 1;
        }

        public Fraction(int a)
        {
            m_a = a;
            m_b = 1;
        }

        public Fraction(int a, int b)
        {
            check(a, b);
            set(a, b);
        }

        public int getNumerator()
        {
            return m_a;
        }

        public void setNumerator(int a)
        {
            if (a == m_a)
                return;

            set(a, m_b);
        }


}
