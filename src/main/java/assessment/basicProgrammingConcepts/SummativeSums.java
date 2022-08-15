package assessment.basicProgrammingConcepts;

public class SummativeSums {
    public static void main(String[] args) {

            int[] numbersToCalc = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
            System.out.println("#1" + " Array Sum: " + calculateSum(numbersToCalc));
            int[] numberToCalc2 = { 999, -60, -77, 14, 160, 301 };
            System.out.println("#2" + " Array Sum: " + calculateSum(numberToCalc2));
            int[] numberToCalc3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
            System.out.println("#3" + " Array Sum: " + calculateSum(numberToCalc3));
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}
