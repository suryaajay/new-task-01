import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        if (a <= b && a <= c) {
            System.out.println(a + " A IS SMALLEST");
        } else if (b <= a && b <= c) {
            System.out.println(b + " B IS SMALLEST");
        } else {
            System.out.println(c + " C IS SMALLEST");
        }
        scanner.close();
    }
}
