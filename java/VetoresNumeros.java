/**
 * Programa Java demonstra como declarar e navegar vetores de números.
 *
 * Objetivos:
 *   - uso de arrays que armazenam números;
 *   - uso do comando for para preencher e percorrer arrays;
 *   - todo array possui a propriedade length, que indica q qtde de elementos armazenados;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class VetoresNumeros {

    public static void main(String[] args) {
        int[] numeros = {4, 5, 3, 2, 1};
        
	System.out.println("Quantidade de elementos armazenados no array (vetor) numeros: " + numeros.length);
        
        System.out.println("\nA seguir o conteúdo armazenado no array numeros:");
        //itera (navega) sob os elementos do array a partir do indice 0
        for (int i = 0; i < numeros.length; i++) { //i faz o papel do indice
            int n = numeros[i];
            System.out.println("\t- posição " + i +" do vetor numeros o conteúdo é: "+n);
        }
        
        System.out.println("\nOutra forma de apresentar os elementos do array numeros:");
        //itera (navega) sob os elementos do array a partir do último indice
        for (int i = numeros.length-1; i >= 0; i--) {
            int n = numeros[i];
            System.out.println("\t- posição " + i +" do vetor numeros o conteúdo é: "+n);
        }
        
        float[] notas = {6.7f, 7f, 8.2f, 5.74f};
        
        System.out.print("\nConteúdo do array de notas: ");
        //o Java define o comando for each, mais simples de iterar sob os elementos do array
        for (float n: notas) {
            //nessa caso não existe uma váriavel de controle (indice)...
            System.out.print(n+", ");
        }
        System.out.println();
        
        /*
         * A seguir um exemplo de codigo que define e carrega um array com nros pares.
         * O maior nro armazenado é 100, o processamento ocorre na ordem: 100, 98, 96, 94...
         * Os nros são mantidos em ordem ascendente (2, 4, 6, 8...), note a lógica inversa
         */
        int maiorPar = 100;
        int[] nrosPares = new int[50];
        for (int i = nrosPares.length-1; i >= 0; i--) {
            nrosPares[i] = maiorPar;
            maiorPar -= 2;
        }
        
        System.out.print("\nConteúdo do array de nrosPares (até 100): ");
        for (int p: nrosPares) {
            System.out.print(p+", ");
        }
        System.out.println();
    }

}
