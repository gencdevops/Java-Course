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


    public static IntValue of(int val)
    {
        if (val < -128  || val > 127)
            return new IntValue(val);

        if (CACHE[val + 128] == null)
            CACHE[val + 128] = new IntValue(val);

        return CACHE[val + 128];
    }


}
