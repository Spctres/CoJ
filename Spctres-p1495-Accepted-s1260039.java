import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer datos
        int[] ni; // lista de enteros
        int n; // numero de enteros

        // AQUI INICIA EL PROGRAMA
        Lee = new Scanner(System.in);
        n = Lee.nextInt();
        ni = new int[n];
        for (int i = 0; i < n; i++) {
            ni[i] = Lee.nextInt();
        }
        Arrays.sort(ni);
        for (int i = 0; i < n; i++) {
            System.out.println(ni[i]);
        }
        Lee.close();
    }
}
