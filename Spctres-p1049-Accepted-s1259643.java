import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;    
        n= sc.nextInt();
        if (n==0) {
            System.out.println(1);
        }
        if (n>0) {
            System.out.println(n*(n+1)/2);
        }
        if (n<0) {
            n= -n;
            System.out.println(-( n*(n+1)/2-1));
        }
    }
} 