/**
 * Programa Java demonstra como declarar e preencher vetores (array).
 * Um array é uma variável que pode armazenar vários valores, organizados por um índice.
 * No Java a capacidade de um array é estática, ou seja, uma vez definida a capacidade
 * de um array não pode mudar. Portanto, adicionar ou remover elementos podem requerer
 * a criação de um novo array, com capacidade maior ou menor.
 *
 * Objetivos:
 *   - uso de arrays;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class DeclaraVetores {

    public static void main(String[] args) {
        int[] numeros; //define
        numeros = new int[] {4, 5, 3, 2, 1}; //atribui os valores

        //definição e atribuição dos valores
        int notas[] = {8, 7, 9, 5};

        int[] vetorNros = new int[] {1, 3, 5, 7, 9};


        int[] algunsPares = new int[10]; //array 'zerado'

        //atribuição posição a posição...
        //primeiro valor fica sempre no índice (posição) 0
        algunsPares[0] = 2;
        algunsPares[1] = 4;
        algunsPares[2] = 6;
        algunsPares[3] = 8;
        algunsPares[4] = 10;
        algunsPares[5] = 12;
        algunsPares[6] = 14;
        algunsPares[7] = 16;
        algunsPares[8] = algunsPares[7] + 2; //18
        //última posição é sempre o tamanho do array - 1 (10-1)
        algunsPares[9] = algunsPares[4] * 2; //20


        int qtd = 100;
        int[] multiplos2 = new int[qtd];
        //carrega o array via for
        for (int i = 0; i < qtd; i++) {
            multiplos2[i] = (i+1) * 2;
        } 

        char palavra[] = {'J','a','v','a'};
        char[] novaPalavra = new char[] {'O','l','a'};
        char[] frase = new char[7];
        //copia os dados do array novaPalavra
        for (int i = 0; i < 3; i++) {
            frase[i] = novaPalavra[i];
        }

        //copia os dados do array novaPalavra
        for (int i = 0; i < 4; i++) {
            frase[3+i] = palavra[i];
        }

        //exemplo de um array vazio (0 elementos)
        long[] arrayVazio = new long[0]; //{}

        System.out.println("Pronto, criamos alguns vetores no Java!");
    }

}
