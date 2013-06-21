/**
 * Programa Java calcula simula o valor de parcelamento de uma compra, a partir 
 * de um preço e nro total de parcelas.
 *
 * Objetivos:
 *   - uso de comando for (repetição);
 *   - operações matemáticas simples;
 *   - uso do printf para formatar o valor da parcela
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

public class CalculaParcelas {

    public static void main(String[] args) {
        float preco = 1000.2f;
        int totalParcelas = 10;
        int intervaloDias = 30;

        //exibe parcelas sem acrescimento
        System.out.println("Pagamento de " + preco + " em " + totalParcelas + " (sem ascrecimo)");
        
        for (int parcela = 1; parcela <= totalParcelas; parcela++) {
            float valorParcela = preco / parcela;
            int dias = intervaloDias * parcela;
            System.out.printf("\tparcela %02d no valor de %.2f, pagto em %d dias\n", parcela, valorParcela, dias);
        }
        
        float taxaMes = .5f;
        //reajusta o preco de acordo com a taxa
        float juros = taxaMes * totalParcelas;
        preco += preco * (juros / 100);

        //exibe parcelas com acrescimento
        System.out.println("\nPagamento de " + preco + " em " + totalParcelas + " (com ascrecimo de " + juros + "%)");

        for (int parcela = 1; parcela <= totalParcelas; parcela++) {
            float valorParcela = preco / parcela;
            int dias = intervaloDias * parcela;
            System.out.printf("\tparcela %02d no valor de %.2f, pagto em %d dias\n", parcela, valorParcela, dias);
        }
    }

}
