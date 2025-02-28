import java.util.Scanner;

public class SumOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a number: ");

        int num = Integer.parseInt(scan.nextLine());

        System.out.println(sumNumbers(num));

        int sum = sumNumbers(num);

        System.out.println(tbd(num));
    }

    public static int sumNumbers(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total = total + i;
        }
        return total;
    }

    public static int tbd(int x) {
        return (x * (x+1))/2;
    }

}

