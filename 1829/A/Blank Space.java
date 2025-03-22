import java.util.Scanner;

public class BlankSpace {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        BlankSpace ob=new BlankSpace();
        while(n-->0)
        {
            ob.find(sc);//passing scanner object as the argument
        }
        sc.close();
    }
    private void find(Scanner sc)
    {
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0,m=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                c+=1;
                m=Math.max(m, c);
            }
            else
            {
                c=0;
            }
        }
        System.out.println(m);
    }
}
