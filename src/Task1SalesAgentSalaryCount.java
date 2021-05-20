import java.util.Scanner;

public class Task1SalesAgentSalaryCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int choice;
        do{
            System.out.println("Choose if the employee is trainee or old after trial period:\n" +
                "1 - trainee\n" +
                "2 - old after trial period employee\n" +
                "0 - exit");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("Input income hours and rate of the employee for count:\n" +
                        "work hours:");
                int quantityWorkHours = scanner.nextInt();
                System.out.println("work rate employee");
                double basicRate = (double) scanner.nextDouble();
                Task1SalesAgentSalary t1 = new Task1SalesAgentSalary(basicRate, quantityWorkHours);
                System.out.println("The sales Agent salary is: " + t1.countSalaryTrainee(quantityWorkHours,basicRate));

            }else if(choice == 2){
                System.out.println("Input income hours and rate of the employee for count:\n" +
                        "work hours:");
                int quantityWorkHours = scanner.nextInt();
                System.out.println("work rate employee");
                double basicRate = (double) scanner.nextDouble();
                System.out.println("Input work experience:");
                int workExperience = scanner.nextInt();
                System.out.println("Input quantity sales:");
                int quantitySales = scanner.nextInt();
                System.out.println("Input Amount sales:");
                double salesAmount = scanner.nextDouble();
                System.out.println("");
                Task1SalesAgentSalary t1 = new Task1SalesAgentSalary(basicRate,quantityWorkHours);
                System.out.println("The sales Agent salary is: " + t1.countSalaryOldAfterTrial(basicRate,quantityWorkHours,workExperience,quantitySales,salesAmount));
            }


        }while(choice !=0);




        System.out.println();




    }
}
