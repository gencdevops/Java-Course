package org.csystem.app;

import org.csystem.util.ArrayUtil;
import org.csystem.util.datetime.DayOfWeek;
import org.csystem.util.math.geometry.Circle;

import java.awt.*;

class App {

    public static void main(String [] args) {
        Color color = Color.RED;

        System.out.println(color.getB() + " " + color.getG() + " " + color.getR());


    }
}

enum Color {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), WHITE(255, 255, 255), BLACK(0, 0, 0);
    private final int m_r, m_g, m_b;

    Color(int r, int g, int b) {
        m_r = r;
        m_g = g;
        m_b = b;
    }

    public int getR() {return m_r;}
    public int getG() {return m_g;}
    public int getB() {return m_b;}

}
