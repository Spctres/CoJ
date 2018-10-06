import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Lee; 
        BigInteger n; 

        BigInteger once = new BigInteger("11");

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        n = new BigInteger(Lee.next());
        while (!n.equals(BigInteger.ZERO)) {
            if (n.mod(once).equals(BigInteger.ZERO)) {
                System.out.println(n + " is a multiple of 11.");
            } else {
                System.out.println(n + " is not a multiple of 11.");
            }
            n = new BigInteger(Lee.next());
        }
        Lee.close();
    }
}