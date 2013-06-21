/**
 * Programa Java demonstra opções de literais suportas pela linguagem.
 * É possível atribuir valores para numeros, utilizando: decimal, octal, hexadecimal e binário.
 * Já para char além do tradicional é possível utilizar essas 4 opções. 
 * O Java suporta Unicode, portanto podemos declarar conteúdo char com código Unicode.
 *
 * Objetivos:
 *   - uso de literais suportadas pelo Java;
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class TipoLiterais {

    public static void main(String[] args) {
        int decimal = 10;
        int octal = 012; //octal = base 8, inicia com 0
        int hexadecimal = 0xA; //hexadecimal = base 16, inicia com 0x
        //int binario = 0b1010; //binario (a partir do Java 7)

        System.out.println("octal = "+octal); //imprime como decimal
        System.out.println("hexadecimal = "+hexadecimal); //tb imprime como decimal

        //forma de exibir o conteúdo de uma variável em hexadecimal
        System.out.println("10 em hexadecimal: "+Integer.toHexString(decimal));
        System.out.println("10 em binário: "+Integer.toBinaryString(decimal));
        System.out.println("10 em octal: "+Integer.toOctalString(decimal));

        long numeroGrande = 123L; //L indica a literal do tipo long
        float ponto = 1.2F; //F indica a literal do tipo float

        //literais caracter
        char letraA = 65; //codigo ASCII
        char letraB = 'B'; //literal char
        char letraC = '\u0043'; //exemplo de definição com código Unicode
        char especial = '\u262F';

        System.out.println("letraA = " + letraA);
        System.out.println("letraB = " + letraB);
        System.out.println("letraC = " + letraC);
        System.out.println("especial = " + especial);
    }

}
