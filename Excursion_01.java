package PreExamOctober2022;

import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cardsTransport = Integer.parseInt(scanner.nextLine());
        int  ticketsMuseum= Integer.parseInt(scanner.nextLine());

        int nightsPrice = nights * 20;
        double cardsTransportPrice = cardsTransport * 1.60;
        int ticketsMuseumPrice = ticketsMuseum * 6;

        double priceOnePerson = nightsPrice + cardsTransportPrice + ticketsMuseumPrice;
        double totalPrice = priceOnePerson * group;
        double priceAfterTaxes = totalPrice + (totalPrice * 0.25);
        System.out.printf("%.2f", priceAfterTaxes);
    }
}
