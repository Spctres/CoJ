import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        byte T; // casos de prueba
        byte n, m; // candidatos y regiones
        int[] suma; // vector de la suma de los candidatos
        int sumaMax; // suma maxima
        int i, j; // indices

      
        Lee = new Scanner(System.in);
      
        T = Lee.nextByte();
        while (T-- > 0) {
            n = Lee.nextByte();
            m = Lee.nextByte();
            suma = new int[n];
      
            sumaMax = Integer.MIN_VALUE;
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++) {
                    suma[j] += Lee.nextInt();
                    if (suma[j] > sumaMax)
                        sumaMax = suma[j];
                }

            for (i = 0; i < n; i++)
                if (suma[i] == sumaMax) {
                    System.out.println(i + 1);
                    break;
                }
        }
    }
}