/**
 * Programa Java implementa uma calculadora, com uma função para cada operação básica.
 *
 * Objetivos:
 *   - uso de funções, variáveis e escopo;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class MinhaCalculadora {

    public static void main(String[] args) {
        int x = somar(10, 20);
        System.out.println("Resultado da 1a soma: " + x);
        
        int y = somar(30, 40);
        System.out.println("Resultado da 2a soma: " + y);
        
        int total = somar(x, y);
        System.out.println("Resultado final: " + total);

	int a = dividir(50, 2);
        System.out.println("Resultado da divisão: " + a);

        int w = multiplicar(15, 3);
        System.out.println("Resultado da multiplicação: " + w);

        int z = subtrair(5, 7);
        System.out.println("Resultado da subtração: " + z);
    }

    static int somar(int x, int y) {
        int resultado = x + y;
        return resultado;
    }

    static int subtrair(int x, int y) {
        int resultado = x - y;
        return resultado;
    }

    static int dividir(int y, int x) {
        int div = y / x;
        return div;
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }

}
