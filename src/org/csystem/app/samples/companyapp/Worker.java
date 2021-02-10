package org.csystem.app.samples.companyapp;

public class Worker extends Employee{
    private double m_feePerHour;
    private int m_hourPerDay;

    public Worker(String citizenId, String name, double feePerHour, int hourPerDay) {
        super(citizenId, name);
        this.m_feePerHour = feePerHour;
        this.m_hourPerDay = hourPerDay;

    }
}
