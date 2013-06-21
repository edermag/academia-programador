/**
 * Programa demonstra opções para declarar variáveis em Java.
 *
 * Objetivos:
 *   - declaração de variáveis;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class DeclaraVar {

   public static void main(String[] args) {
       int numero; //definição
       numero = 10;
       
       int contador = 1; //definição e atribuição
       
       //definição de múltiplas variáveis do mesmo tipo
       int a, b, c;
       a = b = c = 2; //atribuição do mesmo valor

       //exibe o conteúdo das variáveis
       System.out.println("Numero = " + numero);
       System.out.println("Contador = " + contador);
       System.out.println("a = " + a + ", b = " + b + ", c = " + c);

       //definição e atribuição de multiplas vars
       int x = 5, y = 7, z = 9;
       System.out.println("x = " + x + ", y = " + y + ", z = " + z);
   }

}
