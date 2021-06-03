import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal:");
        int p = in.nextInt();
        System.out.print("Enter the rate of interest:");
        double roi = in.nextDouble() / 100;
        System.out.print("Enter the number of years:");
        int t = in.nextInt();
        int a = (int) (p * (1 + roi * t));
        System.out.printf("After %d years at %.1f%%, the investment will be worth"
        + " $%d\n", t, roi * 100, a);
    }
}
