import java.util.*;
public class PalindromicTwist {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int f=0,l=a-1,c=1;
            while(f<l)
            {
                if(s.charAt(f)!=s.charAt(l))
                {
                    if((Math.abs(s.charAt(f)-s.charAt(l)))!=2)
                    {
                        c=0;
                        break;
                    }
                }
                f++;
                l--;
            }
            if(c==0) System.out.println("NO");
                else System.out.println("YES");
        }
        sc.close();
    }
}
