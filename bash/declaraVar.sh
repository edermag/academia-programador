#!/bin/bash

# Script demonstra como declarar variáveis em Bash.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# define as variáveis com atribuição (sem declare)
NUMERO=10
TEXTO="Bash Script";
OUTRO_TEXTO='Programando';
CONDICAO=true
VETOR=('B','A','S','H');
TAXA=5.6;

# imprime o conteúdo das variáveis na console
echo $NUMERO;
echo $TEXTO
echo $OUTRO_TEXTO;
echo $CONDICAO;
echo $VETOR;
echo $TAXA;

# variável não declarada, imprime vazio...
echo $MINHA_VAR;

# instruções declaram variavel antes de atribuir
declare -i X; # inteiro
echo "X=$X"
X=1; # atribui
echo "X=$X"
let "X=2" # atribui com o comando let
echo "X=$X"

declare -r LEITURA='Read-only'; #var somente leitura
echo $LEITURA;
# LEITURA='x'; # não permite

# declara e atribui o home do usuário
declare | grep HOME
echo $HOME

