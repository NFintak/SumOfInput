import java.util.Scanner;

public class SumOfInput {
    public class void main(String[] args) {
        int num = userInput();
        int sum = sumNumbers();
        System.out.println(sum);
    }

    boolean testSumNumbers() {
        return sumNumbers(5) == 15;
    }

    int userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number: ");
        int number = scan.nextInt();
        scan.close();
        return number;
    }

    int sumNumbers(num) {
        total = 0;
        for (int i = 0; i <= num; i++) {
            total = total + i;
        }
        return total;
    }
}