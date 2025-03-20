import java.util.Scanner;

public class EvenSubstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        sc.close();
        int c=0;
        for(int i=0;i<n;i++)
        {
           if((s.charAt(i)-'0')%2==0) //if a char is even then this particular char will produce {index(char)+1} no.of evens
           {
            c+=(i+1);
           }
        }
        System.out.println(c);
    }
}

// for 1234
// 2 is at index 1, so this 2 will produce (index+1)=2 even nos.(12,22)
// 4 is at index 3, so this 4 will produce (index+1)=4 even nos.(1234,234,34,44)
