package org.csystem.app.samples.examsimulationapp;

public class ExamSimulationApp {
    public static void run()
    {
        ExamSimulation physicSimulation = new ExamSimulation("Fizik");
        ExamSimulation mathSimulation = new ExamSimulation("Matematik");

        physicSimulation.run();
        mathSimulation.run();
        physicSimulation.displayResults();
        System.out.println("//////////////////////////////////////////////////////////");
        mathSimulation.displayResults();
    }
}
