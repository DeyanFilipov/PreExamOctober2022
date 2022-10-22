package PreExamOctober2022;

import java.util.Scanner;

public class Workout_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double firstDay = Double.parseDouble(scanner.nextLine());

        double allKg = firstDay;
        for (int i = 0; i < n; i++) {
            double  nextDay = Double.parseDouble(scanner.nextLine());
            firstDay = firstDay + firstDay *(nextDay / 100);
            allKg += firstDay;
        }

        if (allKg >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(allKg - 1000));
        }
        else
        {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - allKg));
        }
    }
}
