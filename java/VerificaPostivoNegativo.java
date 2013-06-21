/**
 * Programa Java define e usa uma função boolean, que indica se o número é maior ou igual a zero.
 *
 * Objetivos:
 *   - uso de variáveis, funções e com condição boolean;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class VerificaPostivoNegativo {

    public static void main(String[] args) {
        int a = 50;
        boolean resultado = ehMaiorQueZero(a);
        
        System.out.println("O número " + a + " é positivo? " + resultado);

        int b = -5;
        System.out.println("O número " + b + " é positivo? " + ehMaiorQueZero(b));
        System.out.println("O número " + b + " é negativo? " + !ehMaiorQueZero(b));
    }

    static boolean ehMaiorQueZero(int n) {
        return n >= 0;
    }

}
