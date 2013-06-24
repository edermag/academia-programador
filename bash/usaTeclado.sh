#!/bin/bash

# Script Bash utiliza entrada de informações pelo teclado.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

echo -e 'Informe um nome (String) qualquer, depois precione ENTER...'
# guarda o conteúdo digitado no teclado na variavel NOME
read NOME

echo -e 'Agora informe a idade (int)...'
read IDADE

echo -e 'E pra encerrar informe o salario (double)...'
read SALARIO

printf "\nNome informado: %s\n" $NOME
printf "Idade informada: %d\n" $IDADE
printf "Salario informada: %.2f\n" $SALARIO

