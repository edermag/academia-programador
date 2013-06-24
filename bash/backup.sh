#!/bin/bash

# Script Bash faz o backup da pasta corrente, coloca o conteúdo em tar.gz na pasta raiz do usuário.
# Utiliza o programa tar.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

SRC=*
DEST=~/
FILE=backup-$(date +%Y%m%d).tar.gz

tar -czf $DEST$FILE $SRC

echo "Backup realizado com sucesso!"
