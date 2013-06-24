# -*- coding: utf-8 -*-

# Programa Python implementa um cadastro de clientes, com entrada via teclado 
# e armazenamento em arquivo texto.
#
# Objetivos:
#   - manipular dados em um arquivo texto.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

import os;

# Apresenta um menu com as opções do cadastro
def montaMenu():
    print
    print "0 - Apagar cliente";
    print "1 - Novo cliente";
    print "2 - Lista clientes";
    print "3 - Finalizar";
    print "Digite a opcao desejada: ";

# Insere os dados do cliente no arquivo
def grava(nome, cpf):
    f = open(nomeArquivo, 'a');
    # mantem um cliente por linha no arquivo, ex: 01232|Jose da Silva
    f.write(cpf + "|" + nome + "\n");
    f.close();

# Imprime todos os clientes (linhas) cadastrados no arquivo.
def lista():
    f = open(nomeArquivo, 'r');
    for line in f:
        dados = line.strip().split("|");
        print "Cliente: ", dados[1], ", CPF: " + dados[0]

# Remove o registro do cliente (linha) do arquivo, se existir.
def remove(cpfRemover):
    #renomea o arquivo original
    os.rename(nomeArquivo, "clientes.temp");
    arquivoOriginal = open("clientes.temp", 'r');

    novo = open(nomeArquivo, 'w');
    removeu = False;

    for line in arquivoOriginal:
        dados = line.strip().split("|");
        cpf = dados[0];
        if (cpf == cpfRemover):
            removeu = True;
        else:
            novo.write(line);

    if removeu:
        print "Removeu o cliente com cpf ", cpfRemover;

    arquivoOriginal.close();
    novo.close();
    # remove o arquivo temporario
    os.remove("clientes.temp");

nomeArquivo = "clientes.txt";

while (True):
    montaMenu();
    opcao = int(raw_input());

    if opcao == 1:
        print "cadastrar...";
        print "-- Inserindo clientes no arquivo", '-' * 10;

        nome = raw_input("Informe o Nome:\n");
        cpf = raw_input("Informe o CPF:\n")

        # grava dados no arquivo
        grava(nome, cpf);
        print '-' * 40;

    elif opcao == 2:
        print "-- Listando clientes do arquivo", '-' * 10;
        lista();
        print '-' * 40;

    elif opcao == 3:
        print "-- Finalizando programa", '-' * 20
        break; # encerra while
    elif opcao == 0:
        print "-- Apagando cliente do arquivo ", '-' * 10;
        cpfRemover = raw_input("CPF do cliente: \n");
        remove(cpfRemover);
    else:
        print "Opção inválida!";


