package SwimingWR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeToSwim1Meter = Double.parseDouble(scanner.nextLine());

        double basicResult = distance * timeToSwim1Meter;
        double slowDownPer15Meters = (distance / 15) * 12.5;

        double totalTime = basicResult + slowDownPer15Meters;

        if (totalTime < currentRecord) {
            System.out.printf("Y %.2f", totalTime);
        } else {
            System.out.printf("N %.2f", currentRecord - totalTime);
        }
    }
}
