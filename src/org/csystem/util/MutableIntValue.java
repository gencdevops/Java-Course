package org.csystem.util;

public class MutableIntValue {
private int m_val;

public MutableIntValue(int val) {
    this.m_val = val;
}

public int getVal() {
    return m_val;
}

public void setVal(int val) {
    m_val = val;
}


}
