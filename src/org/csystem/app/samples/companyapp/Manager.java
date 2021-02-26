package org.csystem.app.samples.companyapp;

public class Manager extends Employee{
    private double m_salary;
    private String m_department;

    public Manager(String citizenId , String name, double salary, String department) {
        super(citizenId , name);
        this.m_salary = salary;
        this.m_department = department;
    }

    public double getSalary() {
        return m_salary;
    }
    public void setSalary(double salary) {
        this.m_salary = m_salary;
    }
    public String getDepartment() {
        return m_department;
    }
    public void setDepartment(String department) {
        this.m_department = department;
    }
    public double calculateInsurancePayment()
    {
        return m_salary * 1.5;
    }

}
