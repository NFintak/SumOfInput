import java.util.Scanner;

public class SumOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //make scanner

        System.out.println("Pick a number: "); //gives prompt

        int num = Integer.parseInt(scan.nextLine()); //assigns input from prompt to num

        System.out.println(sumNumbers(num));

        System.out.println(gaussianCalc(num));
    }

    public static int sumNumbers(int n) {
        long startTimeSum, endTimeSum, elapsedTimeSum;
        int total = 0;
        startTimeSum = System.currentTimeMillis();
        for (int i = 0; i <= n; i++) {
            total = total + i;
        }
        endTimeSum = System.currentTimeMillis();
        elapsedTimeSum = endTimeSum - startTimeSum;
        System.out.println("sumNumbers elapsed time: " + elapsedTimeSum); //output was 0
        return total;
    }

    public static int gaussianCalc(int x) {
        long startTimeGauss, endTimeGauss, elapsedTimeGauss;
        startTimeGauss = System.currentTimeMillis();
        x = (x * (x+1))/2;
        endTimeGauss = System.currentTimeMillis();
        elapsedTimeGauss = endTimeGauss - startTimeGauss; //output was 0
        System.out.println("gaussianCalc elapsed time: " + elapsedTimeGauss);
        return x;
    }
}

