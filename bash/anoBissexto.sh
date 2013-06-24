#!/bin/bash

# Script Bash define uma função para verificar se um determinado ano é ou não Bissexto.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

#Função verifica se o ano é bissexto.
function ehBissexto {
    local ano=$1;

    if [ $((ano%4)) -ne 0 ]; then
        resultado=false;
    elif [ $((ano%400)) -eq 0 ]; then
        resultado=true;
    elif [ $((ano%100)) -eq 0 ]; then
        resultado=false;
    else
        resultado=true;
    fi
}

# for in com limites pré-definidos
for i in `seq 2005 2015`;
do
    # chama a função
    ehBissexto $i
    echo "Ano " $i " é bissexto? " $resultado
done

