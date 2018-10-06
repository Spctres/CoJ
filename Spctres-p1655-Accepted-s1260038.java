import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
  Scanner Lee;
  String texto, texto2;
  int i, j;

  // AQUI INICIA EL PROGRAMA
  Lee = new Scanner(System.in);
  while (Lee.hasNext()) {
   texto = Lee.next();
   texto2 = Lee.next();
   i = j = 0;
   while (i < texto.length() && j < texto2.length()) {
    if (texto.charAt(i) == texto2.charAt(j))
     i++;
    j++;
   }
   if (i == texto.length())
    System.out.println("Yes");
   else
    System.out.println("No");
  }
 }
}