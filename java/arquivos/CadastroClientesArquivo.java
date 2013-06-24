/**
 * Programa Java implementa um cadastro de clientes, com entrada via teclado 
 * e armazenamento em arquivo texto.
 *
 * Esse programa utiliza o componente Arquivo.java.
 *
 * Objetivos:
 *   - manipular dados em um arquivo texto.
 *
 * Módulo: Lógica de programação | Capítulo: XXX | Página: XXX
 * Author: Eder Magalhães
 */

import java.util.Scanner;

public class CadastroClientesArquivo {
    //nome do arquivo em que os dados sao armazenadoss
    static String nomeAquivo = "clientes.txt";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //habilita a tecla enter como separador de conteúdo
        teclado.useDelimiter(System.getProperty("line.separator"));

        int opcao;

        do {
            //exibe o menu de navegação do usúario
            montaMenu();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("-- Inserindo clientes no arquivo --------");
                    System.out.println("Informe o Nome: ");
                    String nome = teclado.next();
                    
                    System.out.println("Informe o CPF: ");
                    String cpf = teclado.next();
                    
                    // grava dados no arquivo
                    grava(nome, cpf);
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println("-- Listando clientes do arquivo ---------");
                    // Le dados do arquivo
                    lista();
                    System.out.println("-----------------------------------------");
                    break;
                //remover esse case (lab opcional)
                case 0:
                    System.out.println("-- Apagando cliente do arquivo ----------");
                    System.out.println("CPF do cliente: ");
                    String cpfRemover = teclado.next();
                    remove(cpfRemover);
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    System.out.println("-- Finalizando programa -----------------");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 3);

    }

    /*
     * Procedimento monta na console um menu de navegação.
     */
    static void montaMenu() {
        System.out.println("");
        System.out.println("0 - Apagar cliente"); //lab opcional
        System.out.println("1 - Novo cliente");
        System.out.println("2 - Lista clientes");
        System.out.println("3 - Finalizar");
        System.out.println("Digite a opcao desejada: ");
        System.out.println("");
    }

    /*
     * Procedimento responsável por cadastrar os dados do cliente no arquivo.
     */
    static void grava(String nome, String cpf) {
        Arquivo a = Arquivo.abrirEscrita(nomeAquivo, "append");
        //mantem um cliente por linha no arquivo, ex: 01232|Jose da Silva
        Arquivo.escrever(a, cpf + "|" + nome);
        Arquivo.fechar(a);
    }

    /*
     * Procedimento responsável por imprimir todos os clientes (linhas) cadastrados no arquivo.
     */
    static void lista() {
        Arquivo a = Arquivo.abrirLeitura(nomeAquivo);
        String linha;
        while ((linha = Arquivo.lerLinha(a)) != null) {
            String[] dados = Arquivo.separaTokens(linha, "|");
            String cpf = dados[0];
            String nome = dados[1];
            System.out.println("Cliente: " + dados[1] + ", CPF: " + dados[0]);
        }
        Arquivo.fechar(a);
    }

    /*
     * Procedimento remove o registro do cliente (linha) do arquivo, se existir.
     */
    static void remove(String cpfRemover) {
        //renomeia o arquivo original
        Arquivo.renomear(nomeAquivo, "clientes.temp");
        Arquivo original = Arquivo.abrirLeitura("clientes.temp");
        Arquivo novo = Arquivo.abrirEscrita(nomeAquivo, "new");
        String linha;
	boolean removeu = false;
        //copia do original todos os clientes com cpf diferente do informado
        while ((linha = Arquivo.lerLinha(original)) != null) {
            String[] dados = Arquivo.separaTokens(linha, "|");
            String cpf = dados[0];
            if (cpf.equals(cpfRemover)) {
                removeu = true;
	    } else {
                Arquivo.escrever(novo, linha);
            }
        }
        if (removeu) {
            System.out.println("Removeu o cliente com cpf "+cpfRemover);
        }

        Arquivo.fechar(original);
        Arquivo.fechar(novo);

        Arquivo.apagar("clientes.temp");
    }

}
