import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if (a==b) {
            System.out.println(0);
            return;
        }
        if (b%a!=0) { // Check if b is a multiple of a
            System.out.println(-1);
            return;
        }
        int q=b/a;
        int c=0;
        while (q%2==0) {
            q/=2;
            c++;
        }
        while (q%3==0) {
            q/=3;
            c++;
        }
        // If there's any other prime factor left in q, transformation is impossible
        if (q != 1) {
            System.out.println(-1);
        } else {
            System.out.println(c);
        }
    }
}
