import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int c=0;
        while(a<=b)
        {
            a*=3;
            b*=2;
            c+=1;
        }
        System.out.println(c);
    }
}
