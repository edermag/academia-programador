/**
 * Programa Java utiliza a entrada via teclado para criar e preencher um array de inteiros.
 * Depois de preencher o array, o usuário indica um dado valor para o programa descobrir
 * a posição (indice) dele no array.
 *
 * Objetivos:
 *   - uso do teclado;
 *   - uso de array (vetor);
 *   - uso do comando for (repetição) e if (condicional);
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class DescobreIndiceVetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Indique o tamanho do array ...");
        int tamanhoArray = teclado.nextInt();
        int numeros[] = new int[tamanhoArray];
        
        //preenche o array (teclado)
        for (int r = 0; r < tamanhoArray; r++){
            System.out.println("Informe o número "+ (r+1) );
            numeros[r] = teclado.nextInt();
        }
        
        System.out.println("Informe o valor (int) pra descobrir o indice");
        int valorDescobrir = teclado.nextInt();
        //verifica a posição
        int x = obtemIndice(numeros, valorDescobrir);
        
        System.out.println("Qual a posicao de "+valorDescobrir+" no array? "+x);
    }

    /*
     * Função recebe o array e o valor. O objetivo e descobrir e retornar a qual posição
     * da valor no array de inteiro.
     * Se o valor não existir retorna -1.
     */
    static int obtemIndice(int[] nros, int valor) {
        for (int i = 0; i < nros.length; i++) {
            if (valor == nros[i]) {
                //se ele entrou no if, quer dizer encontrou o valor
                return i;
            }
        }
        return -1;
    }

}
