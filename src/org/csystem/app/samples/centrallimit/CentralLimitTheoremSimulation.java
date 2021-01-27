package org.csystem.app.samples.centrallimit;

import java.util.Random;

public class CentralLimitTheoremSimulation {
    private final int m_max;
    private final int m_sampleCount;
    private final int m_count;
    private final int [] m_counts;
    private final Random m_random;
    private final int m_divisor;

    private double calculateSamplesAverage()
    {
        int sum = 0;

        for (int i = 0; i < m_sampleCount; ++i)
            sum += m_random.nextInt(m_max + 1);

        return (double)sum / m_sampleCount;
    }

    private void start()
    {
        for (int i = 0; i < m_count; ++i) {
            double avg = calculateSamplesAverage();

            ++m_counts[(int)avg / m_divisor];
        }
    }




}
