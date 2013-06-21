/**
 * Programa Java demonstra como é possível utilizar uma função (function)
 * para calcular números divisiveis em um determinado range de valores.
 * 
 * Em Java uma "função" é um bloco de código que processa instruções,
 * e no fim (conclusão) retorna um resultado para quem o acionou.
 *
 * Na verdade em Java não tem suporte nativo a funções (pelo menos até o Java 7),
 * o bloco de código é o método.
 *
 * Objetivos:
 *   - uso de funções para realizar um cálculo;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class NumerosDivisiveisFuncao {

    public static void main(String[] args) {
        System.out.println("Identificando divisiveis por 10 entre 100 e 1000");
        
        int valorMinimo = 10;
        int valorMaximo = 1000;
        int div = 10;

        //chama a função
        int total = calculaDivisiveis(valorMinimo, valorMaximo, div);
	System.out.println("\nQtos números são divisiveis por "+ div +" ? " + total);

        System.out.println("Identificando divisiveis por 2 entre 1 e 10");

        //chama a função, com outros argumentos, na hora de imprimir
	System.out.println("\nQtos números são divisiveis por 2 ? " + calculaDivisiveis(1, 10, 2));
    }

    /*
     * Bloco de código que centraliza as instruções que calculam os divisores de um número.
     * Ao chamar essa função, é necessário informar o número minimo e maximo que devem ser analisados,
     * além do divisor.
     * Exemplo int x = calculaDivisiveis(1, 10, 2) -> calcula os divisiveis por 2 de 1 a 10. 
     */
    static int calculaDivisiveis(int minimo, int maximo, int divisor) {
        int contador = 0;

        for (int n = minimo; n <= maximo; n++) {
            if (n % divisor == 0) {
		contador++;
            }
        }
        return contador; //resultado da função
    }
}

