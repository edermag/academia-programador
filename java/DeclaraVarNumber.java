/**
 * Programa Java demonstra como declarar variáveis numéricas: inteira e ponto flutuante.
 *
 * Objetivos:
 *   - declaração de variáveis numéricas;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class DeclaraVarNumber {

    public static void main(String[] args) {
        //definição de variáveis numéricas, c/ os 4 tipos inteiros
        byte idade = 40;
        short kmDistancia = 600;
        int qtdeClientes = 39000;
        long habitantesChina = 1300000000L;

        System.out.println("Idade: " + idade);
        System.out.println("kmDistancia: " + idade);
        System.out.println("Qtde de clientes: " + qtdeClientes);
        System.out.println("Habitantes na china (aproximadamente): " + habitantesChina);

        float nota = 7.56f;
        double salario = 2500.7;

        System.out.println("Nota: " + nota);
        System.out.println("Salario: " + salario);
    }
}
