#!/bin/bash

# Script Bash demonstra como recuperar a data atual (máquina).
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

echo 'Data (original): '$(date)

HOJE=`date +%d/%m/%Y`
echo "Data formatada: " $HOJE

echo "Data outro formado: " $(date +%D)

