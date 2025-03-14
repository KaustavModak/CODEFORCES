import java.util.*;

public class SumofRoundNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            ArrayList<Integer> ls=new ArrayList<>();
            int a=sc.nextInt();
            if(a%10!=0)
            {
                ls.add(a%10);
                a-=a%10;
            }
            if(a%100!=0)
            {
                ls.add(a%100);
                a-=a%100;
            }
            if(a%1000!=0)
            {
                ls.add(a%1000);
                a-=a%1000;
            }
            if(a%10000!=0)
            {
                ls.add(a%10000);
                a-=a%10000;
            }
            if(a==10000)
            {
                ls.add(10000);
            }
            System.out.println(ls.size());
            for(int i=0;i<ls.size();i++)
            {
                System.out.print(ls.get(i)+" ");
            }
            System.out.println();
            sc.close();
        }        
    }
}
