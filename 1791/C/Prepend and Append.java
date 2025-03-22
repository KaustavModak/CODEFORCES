import java.util.Scanner;

public class PrependandAppend {
    private void find(Scanner sc)
    {
        int l=sc.nextInt();
        String s=sc.next();
        int a=0,b=l-1;
        while (a<b && Math.abs(s.charAt(a)-s.charAt(b))==1) {
            a++;
            b--;
        }
        System.out.println(b-a+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrependandAppend ob=new PrependandAppend();
        while(n-->0)
        {
            ob.find(sc);
        }
        sc.close();
    }
}
