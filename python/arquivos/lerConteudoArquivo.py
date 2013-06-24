# -*- coding: utf-8 -*-

# Programa Python demonstra como ler o conteúdo do arquivo teste.txt.
# Objetivos:
#   - ler o conteúdo no arquivo da pasta corrente.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

nomeArquivo = "teste.txt"

meuArquivo = open(nomeArquivo, 'r');

print "Início do conteúdo do arquivo ", nomeArquivo,"\n"

print '-'*45

for line in meuArquivo:
    print line.strip();

print '-'*45
print "\nFim do conteúdo do arquivo ", nomeArquivo

meuArquivo.close();

