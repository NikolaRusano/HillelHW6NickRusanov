import java.util.Scanner;

public class Task1SalesAgentSalary {

    private double rate, salesAmount, salary;
    private int incomeHours, workExperience, salesQuantity;

    Scanner scanner = new Scanner(System.in);

    public Task1SalesAgentSalary(double rate,  int incomeHours, int workExperience, int salesQuantity, double salesAmount) {
        this.rate = rate;
        this.salesAmount = salesAmount;
        this.incomeHours = incomeHours;
        this.workExperience = workExperience;
        this.salesQuantity = salesQuantity;
        }

    public Task1SalesAgentSalary(double rate, int incomeHours) {
        this.rate = rate;
        this.incomeHours = incomeHours;

    }



    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public int getIncomeHours() {
        return incomeHours;
    }

    public void setIncomeHours(int incomeHours) {
        this.incomeHours = incomeHours;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public double countBasicSalary(int quantityWorkHours, double basicRate) {
        double salary;
        return salary = 160 * basicRate;
    }


    public double countSalaryByWorkHours(int quantityWorkHours, double basicRate) {
        double salaryBonus;

        if (quantityWorkHours > 160) {
            return salaryBonus = ((quantityWorkHours - 160)*basicRate) * 1.5;
        } else {
            //System.out.println("The person doesn't get overtime bonus");
            return 0;
        }
    }

    public double countSalaryByWorkHoursAndWorkExperience(int quantityWorkHours, double basicRate, int workExperience) {
        double salaryBonus;
        if(workExperience <=2){
            return salaryBonus = this.countBasicSalary(quantityWorkHours,basicRate) *0.01;
        } else if(workExperience > 2 & workExperience <= 4 ){
            return salaryBonus = this.countBasicSalary(quantityWorkHours,basicRate) *0.012;
        } else if(workExperience > 4 & workExperience <= 6 ){
            return salaryBonus = this.countBasicSalary(quantityWorkHours,basicRate) *0.013;
        } else {
            return salaryBonus = this.countBasicSalary(quantityWorkHours, basicRate) *0.014;
        }

    }

    public double countSalaryByQuantitySales(int quantitySales){
        double salaryBonus;
        if(quantitySales > 20){
            return salaryBonus = 250.0;
        }else if(quantitySales < 10){
            return salaryBonus = -150.0;
        }else {
            return 0;
        }
    }
    public double countSalaryByAmountSales(double salesAmount){
        double salaryBonus;
        if(salesAmount > 15000){
            return salaryBonus = 1000.0;
        }else{
            return 0;
        }
    }

    public double countSalaryTrainee(int incomeHours, double rate){
        this.salary = countBasicSalary(incomeHours,rate) + countSalaryByWorkHours(incomeHours,rate);
        return salary;
    }

    public double countSalaryOldAfterTrial(double rate,  int incomeHours, int workExperience, int salesQuantity, double salesAmount){
        this.salary = countBasicSalary(incomeHours,rate) + countSalaryByWorkHours(incomeHours,rate) +
                countSalaryByWorkHoursAndWorkExperience(incomeHours,rate,workExperience) + countSalaryByQuantitySales(salesQuantity)+
                countSalaryByAmountSales(salesAmount);
        return salary;
    }
}
