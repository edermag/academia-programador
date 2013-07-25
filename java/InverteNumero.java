/**
 * Programa Java demonstra um algoritmo simples para inverter um número inteiro.
 *
 * Objetivos:
 *   - uso de comando for (repetição);
 *   - operações matemáticas simples;
 *   - uso do printf para formatar o valor inteiro
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class InverteNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o nũmero... ");
        int numero = teclado.nextInt();
        System.out.printf("Número informado %s%n", numero);

        int numeroInvertido = 0;
        while (numero > 0) {
            numeroInvertido *= 10;
            numeroInvertido += (numero % 10);
            numero /= 10;
        }

        System.out.printf("O número invertido: %s%n", numeroInvertido);
    }

}
