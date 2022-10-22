package PreExamOctober2022;

import java.util.Scanner;

public class ExcursionCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double pricePerTourist = 0.0;

        if (season.equals("spring")) {
            if (people > 5) {
                pricePerTourist = 48;
            }
            else
            {
                pricePerTourist = 50;
            }
        }
        else if (season.equals("summer")) {
            if (people > 5) {
                pricePerTourist = 45;
            }
            else
            {
                pricePerTourist = 48.50;
            }
        }
        else if (season.equals("autumn")) {
            if (people > 5) {
                pricePerTourist = 49.50;
            } else {
                pricePerTourist = 60;
            }
        }
        else if (season.equals("winter")) {
            if (people > 5) {
                pricePerTourist = 85;
            }
            else
            {
                pricePerTourist = 86;
            }
        }
        double finalPrice = pricePerTourist * people;
        if (season.equals("summer")) {
            finalPrice *= .85;
        }
        else if(season.equals("winter")) {
            finalPrice *= 1.08;
        }
        System.out.printf("%.2f leva.", finalPrice);
    }
}
