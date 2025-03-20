import java.util.*;
public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        sc.close();
        int k=0;
        for(int i=0;i<n;i+=k)
        {
            sb.append(s.charAt(i));
            k++;
        }
        System.out.println(sb.toString());
    }
}
