/**
 * Programa Java implementa uma calculadora com as operações matemáticas básicas usando array.
 *
 * Objetivos:
 *   - uso de funções e arrays;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class MinhaCalculadoraArray {

    public static void main(String[] args) {
        int[] x = {10, 20, 5};
        int totalSoma = somar(x);
        System.out.println("Resultado da 1a soma: " + totalSoma);
        
        totalSoma = somar(new int[]{2, 3});
        System.out.println("Resultado da 2a soma: " + totalSoma);
        
        int[] y = {}; //array vazio
        System.out.println("Resultado da 3a soma: " + somar(y));

        int[] w = new int[]{5, 3, 1};
	int totalSubtrair = subtrair(w);
        System.out.println("Resultado da 1a subtração: " + totalSubtrair);

        totalSubtrair = subtrair(new int[] {50, 25, 30, 5});
        System.out.println("Resultado da 2a subtração: " + totalSubtrair);

        //array vazio
        System.out.println("Resultado da 3a subtração: " + subtrair(new int[]{}));
    }

    /*
     * Soma os elementos contidos no array.
     */
    static int somar(int[] numeros) {
        int resultado = 0;
        //for each
        for (int n: numeros) {
            resultado += n;
        }
        return resultado;
    }

    /*
     * Considera o 1o elementos e subtrai pelo restante.
     */
    static int subtrair(int[] nros) {
        if (nros.length == 0) {
            return 0; //se o array é vazio retorna 0!
        }

        int resultado = nros[0];
        //foreach
        for (int i = 1; i < nros.length; i++) {
            resultado -= nros[i];
        }
        return resultado;
    }

}
