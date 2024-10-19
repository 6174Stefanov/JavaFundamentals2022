import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationCost = Double.parseDouble(scanner.nextLine());
        int puzzlesOrders = Integer.parseInt(scanner.nextLine());
        int dollsOrders  = Integer.parseInt(scanner.nextLine());
        int bearsOrders  = Integer.parseInt(scanner.nextLine());
        int minionsOrders  = Integer.parseInt(scanner.nextLine());
        int trucksOrders  = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        int amountOrders = puzzlesOrders + dollsOrders + bearsOrders + minionsOrders + trucksOrders;
        double revenue = puzzlePrice * puzzlesOrders + dollsOrders * dollPrice + bearsOrders * bearPrice + minionsOrders * minionPrice + trucksOrders * truckPrice;

        if (amountOrders >= 50) {
            revenue = revenue * 0.75;
        }
        double rent = revenue * 0.1;
        if (revenue - rent > vacationCost) {
            System.out.printf("Yes! %.2f leva left.", (revenue - rent) - vacationCost);
        } else {
            System.out.println("greda! %d");
        }
    }
}