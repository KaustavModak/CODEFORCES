import java.util.*;
public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a=0;
        while(t-->0)
        {
            String s=sc.next();
            if (s.equals("Tetrahedron")) a += 4;
            else if (s.equals("Cube")) a += 6;
            else if (s.equals("Octahedron")) a += 8;
            else if (s.equals("Dodecahedron")) a += 12;
            else if (s.equals("Icosahedron")) a += 20; 
        }
        sc.close();
        System.out.println(a);
    
    }
}
