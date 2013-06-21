/**
 * Programa Java retorna o dia da semana em extenso. Domingo igual 1 e Sábado 7.
 *
 * Objetivos:
 *   - uso de variáveis e switch (múltiplas condições);
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class ConverteDiaSemana {

    public static void main(String[] args) {
        //modifique essa variável para testar o programa
        int diaSemana = 2;
        String dia = "";

        //armazena o dia
        switch(diaSemana) {
	    case 1: dia = "Domingo"; break;
	    case 2: dia = "Segunda-feira"; break;
	    case 3: dia = "Terça-feira"; break;
	    case 4: dia = "Quarta-feira"; break;
	    case 5: dia = "Quinta-feira"; break;
	    case 6: dia = "Sexta-feira"; break;
	    case 7: dia = "Sabado"; break;
	    default: dia = "Dia invalido!";
        }

        //armazena se é dia útil ou fim de semana
        switch(diaSemana) {
	    case 2:
	    case 3:
	    case 4:
	    case 5:
	    case 6: dia += " (dia útil)"; break;
	    case 1:
	    case 7: dia += " (fim de semana)"; break;
        }
        System.out.println(dia);
    }
    
}

