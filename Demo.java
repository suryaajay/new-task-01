import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending value: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

// Output
Enter the starting value: 10
Enter the ending value: 50
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
