/*
 * Programa Java demonstra como recuperar a data atual (máquina).
 *
 * Módulo: Lógica de programação
 * Author: Eder Magalhães
 */

import java.util.Date;

public class MostraData {

    public static void main(String[] args) {
        Date hoje = new Date();

        System.out.printf("Data (original): %s %n", hoje);
        System.out.printf("Data formatada: %1$te/%1$tm/%1$tY %n", hoje);
        System.out.printf("Data outro formato: %tD %n", hoje);
    }

}
