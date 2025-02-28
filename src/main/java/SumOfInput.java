import java.util.Scanner;

public class SumOfInput {

    public void main(String[] args) {
        int num = userInput();

        int sum = sumNumbers();

        System.out.println(sum);
    }

    boolean testSumOfInput() {
        return sumNumbers(5) == 15;
    }

    int userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int number = scan.nextInt();
        scan.close();
        return number;
    }

    int sumNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }


}