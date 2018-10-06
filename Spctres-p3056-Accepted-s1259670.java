import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Lee;
        boolean[] c1, c2;
        int i;
        boolean nocompatibles = false;

        // aca inicia el programa
        Lee = new Scanner(System.in);
        c1 = new boolean[5];
        c2 = new boolean[5];
        while (Lee.hasNext()) {
            nocompatibles = false;
            for (i = 0; i < 5; i++)
                c1[i] = (Lee.nextInt() == 1);
            for (i = 0; i < 5; i++)
                c2[i] = (Lee.nextInt() == 1);
            // buscamos si son compatibles
            for (i = 0; i < 5; i++)
                if (c1[i] == c2[i]) {
                    nocompatibles = true;
                    break;
                }
            if (nocompatibles) {
                for (i = 0; i < 5; i++)
                    if (c1[i] == c2[5 - 1 - i]) {
                        nocompatibles = true;
                        break;
                    }
            }
            System.out.println((nocompatibles) ? "N" : "Y");
        }
    }
}