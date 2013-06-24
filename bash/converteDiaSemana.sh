#!/bin/bash

# Script Bash demonstra como recuperar a data atual (máquina).
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

DIA=-7;
TEXTO = '';

case $DIA in
    1) echo "Domingo"
    ;;
    2) echo "Segunda-feira"
    ;;
    3) echo "Terça-feira"
    ;;
    4) echo "Quarta-feira"
    ;;
    5) echo "Quinta-feira"
    ;;
    6) echo "Sexta-feira"
    ;;
    7) echo "Sabado"
    ;;
    *) let "Dia invalido!"
    ;;
esac

