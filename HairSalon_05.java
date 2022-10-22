package PreExamOctober2022;

import java.util.Scanner;

public class HairSalon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dailyGoal = Integer.parseInt(scanner.nextLine());
        int moneyCount = 0;
        int diff = 0;
        String command = "";
        String type = "";

       while (moneyCount < dailyGoal) {
           command = scanner.nextLine();

           if (!command.equals("closed")) {
               type = scanner.nextLine();

               if (command.equals("haircut")) {
                   if (type.equals("mens")) {
                       moneyCount += 15;
                   }
                   else if (type.equals("ladies")) {
                       moneyCount += 20;
                   }
                   else if (type.equals("kids")) {
                       moneyCount += 10;
                   }
               }
               if (command.equals("color")) {
                   if (type.equals("touch up")) {
                       moneyCount += 20;
                   }
                   else if (type.equals("full color")) {
                       moneyCount += 30;
                   }
               }
           }
           if (command.equals("closed")) {
               break;
           }
       }
       if (moneyCount >= dailyGoal) {
           System.out.println("You have reached your target for the day!");
       } else {
           diff = Math.abs(dailyGoal - moneyCount);
           System.out.printf("Target not reached! You need %slv. more.%n", diff);
       }
        System.out.printf("Earned money: %slv.", moneyCount);
    }
}