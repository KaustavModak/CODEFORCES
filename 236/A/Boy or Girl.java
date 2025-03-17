import java.util.*;
public class BoyOrGirl {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        ArrayList<Character> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!ls.contains(s.charAt(i)))
            {
                c++;
                ls.add(s.charAt(i));
            }
        }
        if(c%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
        sc.close();
    }
}
