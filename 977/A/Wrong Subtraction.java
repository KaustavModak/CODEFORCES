import java.util.Scanner;
public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        int k=sc.nextInt();
        sc.close();
        while(k-->0)
        {
            if(n%10!=0)
            {
                n-=1;
            }
            else
            {
                n/=10;
            }
        } 
        System.out.println(n);
    }
}
