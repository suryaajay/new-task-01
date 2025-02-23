import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Purchase Amount: ");

        double PurchaseAmount = scanner.nextDouble();
        double FinalePayable;
        double Discount;

        if (PurchaseAmount < 500) {
            Discount = 0;
        } else if (PurchaseAmount <= 1000) {
            Discount = 0.10 * PurchaseAmount;
        } else {
            Discount = 0.20 * PurchaseAmount;
        }
        FinalePayable = PurchaseAmount - Discount;
        System.out.println("Original Purchase Amount: rupees " + PurchaseAmount);
        System.out.println("Discount Applied: rupees " + Discount);
        System.out.println("Final Payable Amount: rupees " + FinalePayable);
        scanner.close();
    }
}
