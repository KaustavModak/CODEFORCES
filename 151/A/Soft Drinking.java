import java.util.*;
public class SoftDrinking {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();

        int x=(k*l)/nl;
        int y=c*d;
        int z=p/np;

        System.out.println(Math.min(Math.min(x,y),z)/n);
        sc.close();
    }
}
