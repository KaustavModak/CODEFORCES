import java.util.*;
public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                f=1;
                break;
            }
        }
        if(f==1) System.out.println("HARD");
        else System.out.println("EASY");
        sc.close();
    }    
}
