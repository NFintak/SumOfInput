import java.util.Scanner;

public class SumOfInput {

    void main(String[] args) {
        int num = userInput();

        int sum = sumNumbers(num);

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
        int n = 0;
        for (int i = 1; i <= num; i++) {
            n = n + i;
        }
        return n;
    }
}

