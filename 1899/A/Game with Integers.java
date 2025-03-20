import java.util.Scanner;

public class GamewithIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            if(((a+10)%3==0) || ((a-10)%3==0))
            {
                System.out.println("First");
            }
            else
            {
                System.out.println("Second");
            }
        }
        sc.close();
    }
}
