package assessment.basicProgrammingConcepts;

import java.util.Scanner;

public class HealthyHearts {
    public static void main (String[] args) {
        System.out.print("What is your age? ");
        Scanner myScanner = new Scanner(System.in);

        int age = Integer.parseInt(myScanner.nextLine());
        int max = 220 - age;
        System.out.println("Your maximum heart rate should be " + max + " beats per minute.");
        double targetMin = Math.ceil(max * 50/100.0);
        double targetMax = Math.ceil(max * 85/100.0);
        System.out.println("Your target HR Zone is " + (int) targetMin + " - " + (int) targetMax + " beats per minute.");
    }
}
