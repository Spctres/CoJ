import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner Lee; 
        double suma, promedio; 
        int i; 

       
        Lee = new Scanner(System.in);
        suma = 0;
        for (i = 1; i <= 12; i++)
            suma += Double.valueOf(Lee.next());
        promedio = suma / 12;
        System.out.println(String.format("$%.2f", promedio).replace(',', '.'));
    }
}