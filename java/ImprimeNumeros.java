/**
 * Programa Java imprime um determinado intervalo de números.
 *
 * Objetivos:
 *   - uso de repetições com o comando while;
 *   - uso dos operadores de pós incremento (+1) e decremento (-1);
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class ImprimeNumeros {

    public static void main(String args[]) {
        int numeroInicio = 1;
        int numeroFim = 10;

        System.out.println("Os numeros de "+numeroInicio+" até "+numeroFim+" (ascendente):");
        //logica: enquanto o nro inicial for menor ou igual ao nro final
        while (numeroInicio <= numeroFim) {
            System.out.println("\t "+numeroInicio++);
        }

        //volta o valor da variavel inicial
        numeroInicio = 1;

        System.out.println("\nOs numeros de "+numeroInicio+" até "+numeroFim+" (descendente):");
        while (numeroFim >= numeroInicio) {
            System.out.println("\t "+numeroFim--);
        }
    }

}
