/**
 * Programa Java usa o componente Arquivo para escrever (adicionar) conteúdo no arquivo teste.txt
 * O arquivo manipulado por esse programa fica contido no diretório corrente.
 *
 * Objetivos:
 *   - escrever conteúdo no arquivo da pasta corrente.
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

public class EscreverArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "teste.txt";
        Arquivo meuArquivo = Arquivo.abrirEscrita(nomeArquivo, "append");
        
        Arquivo.escrever(meuArquivo, "Olá, este é meu primeiro arquivo");
        Arquivo.escrever(meuArquivo, "Testando gravação de dados em arquivo texto (em Java).");

        Arquivo.fechar(meuArquivo);

        System.out.println("Conteúdo foi armazenado no arquivo " + nomeArquivo + "!");
    }

}
