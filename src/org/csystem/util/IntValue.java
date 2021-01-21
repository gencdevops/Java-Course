package org.csystem.util;

public class IntValue {
    private static final IntValue [] CACHE = new IntValue[256];
    private final int m_val;

    private IntValue(int val)
    {
        m_val = val;
    }

    public static final IntValue ZERO = of(0);
    public static final IntValue ONE = of(1);
    public static final IntValue TEN = of(10);





}
