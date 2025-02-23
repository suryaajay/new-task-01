import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        if (number > 0) {
            System.out.println(number + " IT IS POSITIVE");
        } else if (number < 0) {
            System.out.println(number + " IT IS NEGATIVE");
        } else {
            System.out.println("NONE OF THESE");
        }
    }
}

// Output 
Enter a number: 123
123 IT IS POSITIVE

Enter a number: -100
-100 IT IS NEGATIVE
