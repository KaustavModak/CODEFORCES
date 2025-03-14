import java.util.*;

class cp1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline
        int sum = 0;

        while (n-- > 0) {
            String s = sc.nextLine();
            if (s.equals("X++") || s.equals("++X")) {
                sum += 1;
            } else if (s.equals("--X") || s.equals("X--")) {
                sum -= 1;
            }
        }
        sc.close();
        System.out.print(sum);
    }
}
