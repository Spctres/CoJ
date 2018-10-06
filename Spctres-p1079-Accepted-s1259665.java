import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner Lee; // para leer los datos de entrada
        int nt; // numero de casos de prueba
        int n; // tamanio de la matriz
        int[][] matriz; // matriz donde guardar los numeros del triangulo

        // AQUI INICIA EL PROGRAMA!!!
        Lee = new Scanner(System.in);
        nt = Lee.nextInt();
        while (nt-- > 0) {
            n = Lee.nextInt();
            matriz = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    matriz[i][j] = Lee.nextInt();
                }
            }
            System.out.println(obtenerSumaMasLarga(matriz, n));
        }
        Lee.close();
    }

    /**
     * Obtiene la suma mas larga que se puede obtener de un triangulo de enteros
     * desde la punta hasta una de sus ramas
     * 
     * @param matriz
     *            Matriz de enteros a procesar
     * @param n
     *            El tamaño de la matriz de N x N, n debe ser mayor que 0
     * @return Un entero con el resultado de la suma mas larga
     */
    private static int obtenerSumaMasLarga(int[][] matriz, int n) {
        int i, j; // indices
        for (i = n - 2; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                matriz[i][j] = Math.max(matriz[i][j] + matriz[i + 1][j],
                        matriz[i][j] + matriz[i + 1][j + 1]);
            }
        }
        return matriz[0][0];
    }
}
