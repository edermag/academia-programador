/**
 * Programa Java utiliza entrada de informações pelo teclado.
 *
 * Objetivos:
 *   - uso entrada pelo teclado e printf.
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class UsaTeclado {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        //pede para o usuario entrar com o nome, idade e salario da linha de comando
        System.out.println("Informe um nome (String) qualquer, depois precione ENTER...");
        String nome = teclado.next();
        
        System.out.println("Agora informe a idade (int)...");
        int idade = teclado.nextInt();
        
        System.out.println("E pra encerrar informe o salario (double)...");
        double salario = teclado.nextDouble();
        
        System.out.println("------------------------------");
        //com printf eh possível imprimir dados com maior eficiencia
        System.out.printf("Nome informado: %s %n",nome); //%s string, %n quebra linha
        System.out.printf("Idade informada: %d %n",idade); //%d int (decimal)
        System.out.printf("Salario informado: %.2f %n",salario); //%f double ou float
    }

}
