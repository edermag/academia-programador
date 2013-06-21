/**
 * Programa Java calcula a taboada de um determinado número.
 *
 * Objetivos:
 *   - exercício de lógica;
 *   - uso do comando for (repetição);
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número para calcular a tabuada: ");
        int numero = teclado.nextInt();
        calculaTabuada(numero);
    }

    /*
     * Calcula da tabuada do número informado como argumento.
     */
    static void calculaTabuada(int n) {
        if (n <= 0) {
            System.out.println("Informe um número válido para calcular a tabuada!");
            return;
        }

        System.out.println("Calculando tabuada do " + n + "...");

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int resultado = multiplicador * n;
            System.out.println(n+" x "+multiplicador+" = "+resultado);
        }
    }
}
