package org.csystem.app;

import org.csystem.util.ArrayUtil;
import org.csystem.util.math.geometry.Circle;

class App {

    public static void main(String [] args) {

        System.out.println(Direction.LEFT.ordinal());
    }
}

enum Direction {
    LEFT , TOP, BOTTOM, RİGHT
}