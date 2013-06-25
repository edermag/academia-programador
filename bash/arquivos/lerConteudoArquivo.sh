#!/bin/bash

# Script Bash le o conteúdo do arquivo teste.txt.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

nomeArquivo="teste.txt";

echo -e "Início do conteúdo do arquivo " $nomeArquivo ".\n"
echo "--------------------------------------"

cat $nomeArquivo | while read line
do
  echo $line
done

echo "--------------------------------------"
echo -e "\nFim do conteúdo do arquivo " nomeArquivo "."
