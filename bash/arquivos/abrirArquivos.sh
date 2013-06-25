#!/bin/bash

# Script Bash define uma função para criar e carregar o arquivo teste.txt
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# cria um novo arquivo, ou substitui se já existir
> teste.txt

# se existir mantém o conteúdo, senão cria um novo arquivo
>> teste.txt

echo "Programa carregou 2x o arquivo teste.txt"

