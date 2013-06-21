/**
 * Programa Java implementa uma calculadora simples, com entrada via teclado.
 *
 * Objetivos:
 *   - uso do teclado e switch.
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class CalculadoraTeclado {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int x, y, resultado;
        String nomeOperacao;
        
        System.out.println("Informe o operando 1:");
        x = teclado.nextInt();
        
        char operacao;
        System.out.println("Entre com a operacao, escolha os símbolos + - * /");
        operacao = teclado.next().charAt(0);        
        
        System.out.println("Informe o operando 2:");
        y = teclado.nextInt();
        
        switch (operacao) {
            default: resultado = 0; nomeOperacao = "operacao invalida"; break;
            case '+': resultado = x + y; nomeOperacao = "soma"; break;
            case '-': resultado = x - y; nomeOperacao = "subtracao"; break;
            case '*': resultado = x * y; nomeOperacao = "multiplicacao"; break;
            case '/': resultado = x / y; nomeOperacao = "divisao"; break;
        }

        System.out.printf("Resultado da %s = %s \n", nomeOperacao, resultado);
    }

}
