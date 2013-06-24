#!/bin/bash

# Script Bash demonstra como utilizar laços (repetições).
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

echo 'Testando for in:'
# for in com nros pre-definidos
for index in 1 2 3 4 5
do
  printf "\t%s\n" "${index}"
done

declare -i CONTADOR;
CONTADOR=10

echo -e '\nTestando while:'
# usa o operador 'maior que'
while [  $CONTADOR -gt 0 ]; do
    printf "\tContador: %s\n" $CONTADOR
    ((CONTADOR--)); 
done

echo -e -n "\nTestando until: "
var=0;
until ((var > 10))
do
    echo -n "$var "
    (( var++ ))
done

echo

echo -e -n '\nTestando for in com letras: '
# usa a função echo, que já resolve a impressão de letras em sequência
for l in `echo {a..f}`;
do
    echo -n "$l "
done
echo

# lista o conteudo do diretorio home
echo -e "\n Conteúdo do diretório home do usuário"
for f in $( ls ~ ); do
    echo -e "\t" $f
done

