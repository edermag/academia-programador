/**
 * Programa Java define uma função para verificar se um determinado ano é ou não Bissexto.
 *
 * Objetivos:
 *   - uso de funções;
 *   - uso de expressões booleanas (c/ if);
 *   - uso de repetições com o comando for;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class AnoBissexto {

    public static void main(String args[]) {
        //verifica um range de anos, a partir de 2005 até 2015
        for (int anoInformado = 2005; anoInformado <= 2015; anoInformado++){
            boolean resultado = ehBissexto(anoInformado);
            System.out.println("Ano "+anoInformado+" é bissexto? "+resultado);
        }
    }

    /*
     * Função recebe como argumento o ano, e retorna boolean indicando se ou nao bissexto.
     */
    static boolean ehBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
        
	//o trecho a seguir (comentado) é uma outra solução para verificar bissexto, com ifs:

        /*
        if (ano % 4 == 0 && ano % 100 !=0) {
            return true;
        } else if (ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
        */
    }

}

