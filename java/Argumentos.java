/*
 * Programa Java demonstra como trabalhar com argumentos passados na console.
 * Exemplo de uso: $ java Argumentos Programa escrito em Java
 *
 * Módulo: Lógica de programação
 * Author: Eder Magalhães
 */
public class Argumentos {

    public static void main(String[] args) {
        System.out.println("Número de argumentos: "+args.length);
        String todosArgs = "";
        for (String a: args) {
            todosArgs += a+" ";
        }
        System.out.println("Argumentos: "+todosArgs);
    }

}
