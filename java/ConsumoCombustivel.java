/**
 * Programa Java calcula o consumo médio de um carro (km por hora) a partir das informações:
 *   - quantidade de gasolina no tanque;
 *   - quantidade de horas percorridas;
 *   - velocidade média;
 *
 * Objetivos:
 *   - exercício de lógica;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class ConsumoCombustivel {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de gasolina no tanque: ");
        int tanqueGasolina = teclado.nextInt();

        System.out.print("Ok, agora informe quantas horas foram precorridas: ");
        int horasPercorridas = teclado.nextInt();

        System.out.print("Por fim me diga qual era a velocidade média: ");
        int velocidadeMedia = teclado.nextInt();

        if (tanqueGasolina < 1 || horasPercorridas < 1 || velocidadeMedia < 1) {
            System.out.println("Entre com dados validos!");
            return;
        }

        //calculo para descobrir o valor
        double kmMedia = (double) velocidadeMedia * horasPercorridas / tanqueGasolina;

        System.out.println("\nO consumo médio foi de "+kmMedia+" km percorridos por litro");
    }

}
