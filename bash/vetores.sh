#!/bin/bash

# Script Bash demonstra como declarar e navegar vetores.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

NUMEROS=(4, 5, 3, 2, 1);

echo 'Quantidade de elementos armazenados no array (vetor) numeros:' ${#NUMEROS[@]};

# a opção -e habilita interpretação de caracter especiais
echo -e '\nNavega e imprime os elementos do array'

# for tradicional em bash, acessa os elementos do array
for (( i = 0; i < ${#NUMEROS[@]}; i++ ));
do
    echo -e "\t- posição " $i " do vetor numeros o conteúdo é: " ${NUMEROS[$i]}
done

declare -a VETOR_DECLARADO;
echo -e "\nVETOR_DECLARADO = ${VETOR_DECLARADO}"

LETRAS=('B', 'A', 'S', 'H');

echo -e '\nNavegando em array com for in';

# for in em bash
for i in "${LETRAS[@]}"
do
    echo -e '\t' $i
done

NUMEROS_TEXTO=( zero one two three four ) # sem aspas

echo "\${NUMEROS_TEXTO[@]:0} " ${NUMEROS_TEXTO[@]:0} # imprime todos os elementos do array
echo "\${NUMEROS_TEXTO:1}" ${NUMEROS_TEXTO:1} # imprime o 1o elemento do array, a partir do 1o caracter
echo "\${#NUMEROS_TEXTO} " ${#NUMEROS_TEXTO} # tamanho do primeiro elemento (zero = 4 caracteres)
echo "\${#NUMEROS_TEXTO[*]}" ${#NUMEROS_TEXTO[*]} # outra forma de verificar o tamanho do array
echo "\${NUMEROS_TEXTO[@]:1:2}" ${NUMEROS_TEXTO[@]:1:2} # imprime o segundo (1) e terceiro (2) elemento

