import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
  Scanner Lee;
  byte T;
  byte caso;
  String cadena, salida;
  char letra;
  int i, j;
  String aux;

  // AQUI INICIA EL PROGRAMA
  Lee = new Scanner(System.in);
  T = Lee.nextByte();
  for (caso = 1; caso <= T; caso++) {
   System.out.print("Case " + caso + ": ");
   cadena = Lee.next();
   salida = "";
   letra = cadena.charAt(0);
   aux = "";
   for (i = 1; i < cadena.length(); i++) {
    if (cadena.charAt(i) >= '0' && cadena.charAt(i) <= '9')
     aux += cadena.charAt(i);
    else {
     for (j = 0; j < Integer.parseInt(aux); j++)
      salida += letra;
     letra = cadena.charAt(i);
     aux = "";
    }
   }
   for (j = 0; j < Integer.parseInt(aux); j++)
    salida += letra;
   System.out.println(salida);
  }
 }
}