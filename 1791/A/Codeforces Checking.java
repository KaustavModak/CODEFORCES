import java.util.Scanner;
public class CodeforcesChecking {
    private void find(Scanner sc)
    {
        String s="codeforces";
        char c=sc.next().charAt(0);
        if(s.indexOf(c,0)!=-1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CodeforcesChecking ob=new CodeforcesChecking();
        while(n-->0)
        {
            ob.find(sc);
        }
        sc.close();
    }
}
