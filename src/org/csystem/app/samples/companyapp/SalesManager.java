package org.csystem.app.samples.companyapp;

public class SalesManager extends Manager{
    private double m_extra;


    public SalesManager(String citizenId, String name, double salary, String department, double m_extra) {
        super(citizenId, name, salary, department);
        this.m_extra = m_extra;
    }

    public double getM_extra() {
        return m_extra;
    }

    public void setM_extra(double m_extra) {
        this.m_extra = m_extra;
    }

}
