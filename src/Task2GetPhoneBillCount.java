import java.util.Scanner;

public class Task2GetPhoneBillCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input basic price internet package");
        double basicInternetPrice = scanner.nextDouble();
        System.out.println("Input used GB internet:");
        double usedGB = scanner.nextDouble();
        System.out.println("input minutes of talk by phone around Ukraine:");
        double minutesPhoneTalkUKR = scanner.nextDouble();
        System.out.println("Input quantity sent sms messages:");
        int quantitySentSms = scanner.nextInt();
        System.out.println("Input abroad calls zone1:");
        double abroadCallsZone1 = scanner.nextDouble();
        System.out.println("Input abroad calls zone2:");
        double abroadCallsZone2 = scanner.nextDouble();
    }
}
