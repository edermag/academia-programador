# -*- coding: utf-8 -*-

# Programa Python demonstra como abrir o arquivo teste.txt de varias formas.
# Objetivos:
#   - carregar arquivo na pasta corrente.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# abre o arquivo teste.txt para escrita, se existir substitui o conteudo
a = open('teste.txt', 'w');

# abre o arquivo e mantém o conteúdo, caso já exista
b = open('teste.txt', 'a');

# abre para leitura (read-only);
c = open('teste.txt', 'r');

# fecha os arquivos
a.close();
b.close();
c.close();

print "Programa carregou e fechou 4x o arquivo teste.txt";

