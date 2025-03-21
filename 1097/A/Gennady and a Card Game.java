import java.util.Scanner;

public class GennadyandaCardGame {
    private int find(String a,String s,int k) //method to find if same character is present or not
    {
        while(k-->0)
        {
            if(s.charAt(k)==a.charAt(k))
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        String arr[]=new String[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.next();
        }
        sc.close();
        // approach without find() method
        // int f=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     int k=2;
        //     while(k-->0)
        //     {
        //         if(s.charAt(k)==arr[i].charAt(k))
        //         {
        //             f=1;
        //             break;
        //         }
        //     }     
        // }
        // if(f==1) System.out.println("YES");
        // else System.out.println("NO");
        GennadyandaCardGame ob=new GennadyandaCardGame();
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            int k=2;
            int x=ob.find(arr[i],s,k);//method call
            if(x==1)
            {
                f=1;
                break;
            }
        }
        if(f==1) System.out.println("YES");
        else System.out.println("NO");
    }

}
