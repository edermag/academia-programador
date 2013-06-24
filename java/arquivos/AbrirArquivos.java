/**
 * Programa Java usa o componente Arquivo para abrir o arquivo teste.txt de várias formas.
 * O arquivo manipulado por esse programa fica contido no diretório corrente.
 *
 * Objetivos:
 *   - carregar arquivo na pasta corrente.
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

public class AbrirArquivos {

    public static void main(String[] args) {
        //cria e abre um novo arquivo
        Arquivo a = Arquivo.abrirEscrita("teste.txt", "new");

        //abre um arquivo que ja existia, e limpa seu conteudo
        Arquivo b = Arquivo.abrirEscrita("teste.txt", "truncate");

        //abre um arquivo que ja existia e mantem seu conteudo
        Arquivo c = Arquivo.abrirEscrita("teste.txt", "append");

        Arquivo d = Arquivo.abrirLeitura("teste.txt");

	//fecha os arquivos
        Arquivo.fechar(a);
        Arquivo.fechar(b);
        Arquivo.fechar(c);
        Arquivo.fechar(d);

	System.out.println("Programa carregou e fechou 4x o arquivo teste.txt");
    }

}
