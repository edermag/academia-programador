/**
 * Programa Java demonstra como declarar e navegar vetores de caracteres.
 *
 * Objetivos:
 *   - uso de arrays que armazenam caracteres (char e String);
 *   - uso do comando for para preencher e percorrer arrays;
 *   - todo array possui a propriedade length, que indica q qtde de elementos armazenados;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class VetoresCaracteres {

    public static void main(String[] args) {
        char[] vogais = { 'a', 'e', 'i', 111, 'u' }; //111 é 'o' em ASCII

        //com println é possível imprimir os elementos de um array char
        System.out.println(vogais);

        /*
         * Trecho a seguir cria um vetor que armazena o alfabeto, 
         * com as letras Maísculas em ordem decrescente (de Z a A).
         */
        char[] alfabetoMaiusculo = new char[27];
        char letra = 'Z';
        int i = 0;

        while(letra >= 'A') {
           alfabetoMaiusculo[i++] = letra--;
        }

        //trecho para imprimir o conteudo do array alfabetoMaiusculo
        System.out.print("Conteúdo do array alfabetoMaiusculo: ");
        for (char l: alfabetoMaiusculo) {
            System.out.print(l+" ");
        }
        System.out.println();

        String[] palavras = new String[] {"Programando", "arrays", "em", "Java"};
        System.out.print("Conteúdo do array palavras: ");

        //foreach, mais simples
        for (String s: palavras) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
