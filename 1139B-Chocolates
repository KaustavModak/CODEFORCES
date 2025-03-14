import java.util.*;

public class Chocolates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        long sum=arr[n-1];
        int req=arr[n-1]-1;
        for(int i=n-2;i>=0;i--)
        {
            req=Math.min(arr[i],req);
            sum+=req;
            req-=1;
            if(req<=0) break;
        }
        sc.close();
        System.out.print(sum);
    }
}
