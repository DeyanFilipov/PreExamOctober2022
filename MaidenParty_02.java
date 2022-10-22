package PreExamOctober2022;

import java.util.Scanner;

public class MaidenParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maidenParty = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChains = Integer.parseInt(scanner.nextLine());
        int caricature = Integer.parseInt(scanner.nextLine());
        int luckySurprises = Integer.parseInt(scanner.nextLine());

        double Sum = loveMessages * 0.60 + waxRoses * 7.20 + keyChains * 3.60 + caricature * 18.20 + luckySurprises * 22;
        int items = loveMessages + waxRoses + keyChains + caricature + luckySurprises;
        if (items > 25) {
            Sum = Sum - (Sum * 0.35); }
        double host = Sum / 10;
        double profit = Sum - host;
        if (profit > maidenParty) {
            System.out.printf("Yes! %.2f lv left.", profit - maidenParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", maidenParty - profit);
        }

    }
}
