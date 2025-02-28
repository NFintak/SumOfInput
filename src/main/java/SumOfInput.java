import java.util.Scanner;

public class SumOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //make scanner

        System.out.println("Pick a number: "); //gives prompt

        int num = Integer.parseInt(scan.nextLine()); //assigns input from prompt to num

        System.out.println(sumNumbers(num)); //prints sum of numbers 0 thru num

        System.out.println(tbd(num)); //prints sum of numbers 0 thru num
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

