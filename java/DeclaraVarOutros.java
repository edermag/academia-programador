/**
 * Programa Java demonstra como declarar variáveis de tipos: boolean, char e String.
 *
 * Objetivos:
 *   - declaração de variáveis;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class DeclaraVarOutros {

    public static void main(String[] args) {
        boolean pagamentoAprovado = true;
        
        char letraA = 'a';
        
        String palavra = "Java";
        
        System.out.println("pagamentoAprovado = " + pagamentoAprovado);
        System.out.println("letraA = " + letraA);
        System.out.println("palavra = " + palavra);
        System.out.println();

        int qdteProdutos = 0;

        //atribui a condição boolean
        boolean temEstoque = qdteProdutos > 0;

        //pega o codigo ASCII de 'a' e soma 1
        char letraB = ++letraA;

        //o tipo char suporte nros inteiros (aprox. no limite de short)
        char letraC = 99;

        String frase = "Ola "+palavra;//o operador '+' concatena o conteúdo das strings

        System.out.println("temEstoque " + temEstoque);
        System.out.println("letraB = " + letraB);
        System.out.println("letraC = " + letraC);
        System.out.println("frase = " + frase);
        System.out.println();

        String outraFrase = "Conteudo \'entre aspas\'";
        System.out.println("outraFrase = " + outraFrase);

        //exibe a qtde de letras na frase
        System.out.println("Qtde de letras na outraFrase: " + outraFrase.length());
        System.out.println();

        String texto = "Uma frase no começo.\nOutra no fim...";
        System.out.println("texto = " + texto+"\n");

        String nada = null; //String (objeto) nula
        System.out.println("nada = " + nada);
    }

}
