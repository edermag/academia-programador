# -*- coding: utf-8 -*-

# Programa Python demonstra como escrever (adicionar) conteúdo no arquivo teste.txt.
# Objetivos:
#   - escrever conteúdo no arquivo da pasta corrente.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

nomeArquivo = "teste.txt"

meuArquivo = open(nomeArquivo, 'a');
meuArquivo.write("Olá, este é meu primeiro arquivo.\n");
meuArquivo.write("Testando gravação de dados em arquivo texto (em Python).\n");

meuArquivo.close();

print "Conteúdo foi armazenado no arquivo ", nomeArquivo, "!";

