import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner Lee; // Pasra leer los datos de entrada
        int i; // para los datos de entrada

     
        Lee = new Scanner(System.in);
        while (Lee.hasNext()) {
            i = Lee.nextInt();
            if (i == 42) {
                break;
            }
            System.out.println(i);
        }
    }
}