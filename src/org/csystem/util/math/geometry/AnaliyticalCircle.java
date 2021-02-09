package org.csystem.util.math.geometry;

public class AnaliyticalCircle extends Circle  {
    private Point m_center;

    public AnaliyticalCircle(double r) {
        this(r , 0 , 0);
    }

    public AnaliyticalCircle(double r, int x, int y) {
        super(r);
        m_center = new Point(x, y);
    }
    public int getX() {return m_center.x;}
    public int getY() {return m_center.y;}

    public void setX(int val) {m_center.x = val;}
    public void setY(int val) {m_center.y = val;}


}
