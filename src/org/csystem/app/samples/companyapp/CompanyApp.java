package org.csystem.app.samples.companyapp;

public class CompanyApp {
    private CompanyApp() {

    }
    public void run() {

        Worker worker = new Worker("12345678912", "Ali" , 100 , 8);
        Manager manager = new Manager("12345678924" , "Veli" , 20_000 , "Software");

        HumanResource humanResource = new HumanResource();
        humanResource.payInsurance(worker);
        humanResource.payInsurance(manager);

    }
}
