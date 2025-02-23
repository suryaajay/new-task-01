import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the pattern: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(n + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}