#!/bin/bash

# Script Bash demonstra o uso de comando if (condicional) em diversas situações.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

if [ 1 ]; then
    echo "if [ 1 ]; é true"
else
    echo "if [ 1 ]; é false"
fi

echo

declare -i NUMERO;

echo "If compara NUMERO sem valor"

if [ $NUMERO ]; then
    echo 'if [ $NUMERO ]; é true'
else
    echo 'if [ $NUMERO ]; é false' # variavel não tem valor
fi

echo

NUMERO=0;
echo "NUMERO = $NUMERO";
if [ $((NUMERO)) ]; then #$((NUMERO)) é o mesmo de $NUMERO
    echo 'if [ $((NUMERO)) ]; é true' # variavel tem valor
else
    echo 'if [ $((NUMERO)) ]; é false'
fi

echo

# usa o pos-incremento (+1)
X=$((++NUMERO));

echo "Compara X ($X) e NUMERO ($NUMERO)"
if [ $NUMERO -eq $X ]; then
    echo 'if [ $NUMERO -eq $X ]; é true' # mesmo valor
else
    echo 'if [ $NUMERO -eq $X ]; é false'
fi

echo

# sinal de comparacao (-eq ou =)

if [ "oi" = "tchau" ]; then
    echo 'if [ "oi" = "tchau" ]; é true'
else
    echo 'if [ "oi" = "tchau" ]; é false'
fi

echo

if [ false ]; then
    echo "if [ false ]; é true" # considera false como texto (string), com conteúdo
else
    echo "if [ false ]; é false"
fi

echo

if [ false = true ]; then
    echo "if [ false = true ]; é true" 
else
    echo "if [ false = true ]; é false" # compara o conteudo, resultado esperado
fi

echo

file="./condicoes.sh"
# verifica se o arquivo condicoes.sh existe
if [ -e $file ]; then
    echo "Arquivo $file existe"
else
    echo "Arquivo $file existe"
fi

