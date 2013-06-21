/**
 * Programa Java calcula a potência a partir de um nro base e expoente.
 * O calculo de potência desse programa só se aplica a nros positivos.
 *
 * Demonstra como utilizar recursividade.
 *
 * Objetivos:
 *   - exercício de lógica com recursividade;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = teclado.nextInt();
        
        System.out.print("Informe o expoente: ");
        int expoente = teclado.nextInt();
        
        if (base < 0) {
            System.out.println("Programa só calcula com base positiva!");
            return;
        }
        
        int resultado = calculaPotencia(expoente, base);
        System.out.println("\nResultado de "+base+" ^ "+expoente+" = "+resultado);
    }

    /*
     * Função recursiva, realiza o calculo de potência.
     */
    static int calculaPotencia(int exp, int base) {
        if (exp == 0)
            return 1;
        
        return base * calculaPotencia(--exp, base);
    }
}

