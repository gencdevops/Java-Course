package org.csystem.app.samples.randomobjectgeneratorapp;

import java.util.Arrays;
import java.util.Random;

public class RandomObjectArrayGenerator {

       private final Random m_random;
       private final Object [] m_objects;

       public RandomObjectArrayGenerator(int n) {
           m_random = new Random();
           m_objects = new Object[n];

       }
       public Object [] getObjects() {
          return m_objects;
       }



}
