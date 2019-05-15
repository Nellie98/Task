import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an odd number between 2 and 10000");

        String oddNumber = scanner.nextLine();
        int N = 1;
        if (N <= 2) {
            System.out.println("Error. Invalid number.");
        } else {
            System.out.println("N = " + oddNumber);
        }
    }



}
