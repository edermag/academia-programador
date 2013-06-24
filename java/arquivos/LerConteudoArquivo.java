/**
 * Programa Java usa o componente Arquivo para ler o conteúdo do arquivo teste.txt
 * O arquivo manipulado por esse programa fica contido no diretório corrente.
 *
 * Objetivos:
 *   - ler o conteúdo no arquivo da pasta corrente.
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */
public class LerConteudoArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "teste.txt";
        Arquivo meuArquivo = Arquivo.abrirLeitura(nomeArquivo);

        System.out.println("Início do conteúdo do arquivo " + nomeArquivo + ".\n");
        System.out.println("--------------------------------------");

        String linha = Arquivo.lerLinha(meuArquivo);
        //enquanto existir conteúdo, imprima
        while (linha != null) {
            System.out.println(linha);
            linha = Arquivo.lerLinha(meuArquivo);
        }

        Arquivo.fechar(meuArquivo);
        System.out.println("--------------------------------------");
        System.out.println("\nFim do conteúdo do arquivo " + nomeArquivo + ".");
    }

}
