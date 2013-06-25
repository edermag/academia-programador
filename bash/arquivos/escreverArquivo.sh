#!/bin/bash

# Script Bash adiciona conteúdo ao arquivo teste.txt.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

nomeArquivo="teste.txt";

echo "Olá, este é meu primeiro arquivo" >> $nomeArquivo;
echo "Testando gravação de dados em arquivo texto (em Bash)." >> $nomeArquivo;

echo "Conteúdo foi armazenado no arquivo " $nomeArquivo "!";

