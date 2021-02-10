package org.csystem.app.samples.companyapp;

public class Worker extends Employee{
    private double m_feePerHour;
    private int m_hourPerDay;

    public Worker(String citizenId, String name, double feePerHour, int hourPerDay) {
        super(citizenId, name);
        this.m_feePerHour = feePerHour;
        this.m_hourPerDay = hourPerDay;

    }

    public double getFeePerHour() {
        return m_feePerHour;
    }
    public void setFeePerHour(double feePerHour) {
        this.m_feePerHour = feePerHour;
    }
    public int getHourPerDay() {
        return m_hourPerDay;
    }
    public void setHourPerDay(int hourPerDay) {
        this.m_hourPerDay = hourPerDay;
    }

}
