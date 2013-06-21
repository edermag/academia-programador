/**
 * Programa Java demonstra o uso de operadores em variáveis.
 *
 * Objetivos:
 *   - declaração de variáveis;
 *   - uso de operadores básicos;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class Operadores {

    public static void main(String args[]) {
        int x = 5 + 3 * 4 / 2 - 1;
        System.out.println("5 + 3 * 4 / 2 - 1 = " + x);

        int a = 5, b = 2, c = 2 * 2;

        int resultado1 = a * 6 + b * 5;
        System.out.println("5 * 6 + 2 * 5 = " + resultado1);

        int resultado2 = a * (6 + b) * 5;
        System.out.println("5 * (6 + 2) * 5 = " + resultado2);

        int resultado3 = a * (6 + b * 5);
        System.out.println("5 * (6 + 2 * 5) = " + resultado3);

        int resultado4 = 20 / b * 3;
        System.out.println("20 / 2 * 3 = " + resultado4);

        //divisao de inteiro, gera inteiro
        int divInteiro = 7 / 2;
        System.out.println("7 / 2 = " + divInteiro);

        int restoDivInteiro = 7 % 2;
        System.out.println("resto de 7 / 2 = " + restoDivInteiro);

        //divisao de float, gera float
        float divFlutuante = 7.0F / 2;
        System.out.println("7.0 / 2 = " + divFlutuante);

        //pos-incremento, similar x = x + 1 ou x+=1
        x++;
        System.out.println("Incremento de x = " + x);
    }

}
