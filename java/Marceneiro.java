/**
 * Programa Java otimiza o trabalho do Marceneiro, definido o tamanho da peça (pedaço) o
 * programa calculas quantas peças dentro uma metragem maior (taboas). Dessa forma o Marceiro
 * pode escolher qual a melhor metragem de taboa.
 *
 * Objetivos:
 *   - exercício de lógica;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class Marceneiro {

    static int pedaco = 45;

    public static void main(String[] args) {
        System.out.println("Cada peça tem "+pedaco+"cm\n");

        calcularPedacosPorMetros(100);
        calcularPedacosPorMetros(400);
        calcularPedacosPorMetros(500);
        calcularPedacosPorMetros(600);
        calcularPedacosPorMetros(1000);
    }

    /*
     * Procedimento recebe o tamanho da taboa (em centímetros), calcula quantas peças podem
     * cortadas e quanto sobra.
     */
    static void calcularPedacosPorMetros(int taboa) {
        if (taboa <= 0) {
            System.out.println("Valor inválido, entre com maior que 0!");
        } else {
            System.out.print("Quantos pedaços existem por "+(taboa/100.0)+" metros? ");
            
            int pedacosPorMetros = taboa / pedaco;
            System.out.print(pedacosPorMetros+" peças\n");
            
            System.out.print("Qtde sobra por "+(taboa/100.0)+"m: ");
            int sobras = taboa % pedaco;
            System.out.print(sobras+"cm\n");
        }
    }

}
