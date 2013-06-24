#!/bin/bash

# Script Bash demonstra como funciona o escopo de variáveis (global e local).
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

declare VAR_GLOBAL;

function funcaoInicial() {
    local VAR_INICIAL="Variável declarada em funcaoInicial.";
    echo "$VAR_INICIAL";
}

function funcaoFinal() {
    local VAR_FINAL="Variável declara em funcaoFinal";
    VAR_GLOBAL="Modificada em funcaoFinal";
    VAR_X=1
    return 1;
}

echo "VAR_GLOBAL = " $VAR_GLOBAL # vazio
echo

echo 'Chamando a funcaoInicial'
resultado=$(funcaoInicial); # uma das formas de recuperar o retorno da função
echo "resultado = " $resultado;
echo "VAR_INICIAL = "$VAR_INICIAL; # vazio
echo

echo 'Atribuindo teste p/ a variável VAR_GLOBAL';
VAR_GLOBAL='teste';
echo "VAR_GLOBAL = " $VAR_GLOBAL
echo

echo 'Chamando a funcaoFinal'
funcaoFinal;
echo "VAR_GLOBAL = " $VAR_GLOBAL
