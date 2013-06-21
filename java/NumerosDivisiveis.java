/**
 * Programa Java realiza comparações em um determinado range de números.
 *
 * Objetivos:
 *   - uso de variáveis, while (repetição), if (condicional) e escopo;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class NumerosDivisiveis {

    public static void main(String[] args) {
        int numeroDe = 100;
	int numeroAte = 2556;

        System.out.println("Resumo de divisiveis entre " + numeroDe + " e " + numeroAte);

        int pares = 0;
	int impares = 0;
	int divPorCinco = 0;
        
        while (numeroDe <= numeroAte) {
            //verifica se o nro é par
            if (numeroDe % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            //verifica se o nro é 
            if (numeroDe % 5 == 0) {
                divPorCinco++;
            }

            numeroDe++;
        }

        System.out.println("\t- Números pares: " + pares);
        System.out.println("\t- Números impares: " + impares);
        System.out.println("\t- Números divisiveis por 5: " + divPorCinco);
    }

}
