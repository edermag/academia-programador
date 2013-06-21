# -*- coding: utf-8 -*-

# Programa Python imprime um determinado intervalo de números.
# Objetivos:
#   - uso de repetições com o comando while.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

numeroInicio = 1;
numeroFim = 10;

print "Os numeros de ",numeroInicio," até ",numeroFim," (ascendente):";

# em ordem ascendente
while (numeroInicio <= numeroFim):
    print "\t ",numeroInicio;
    numeroInicio+=1;

numeroInicio = 1;

print "Os numeros de ",numeroInicio," até ",numeroFim," (decrescente):";

# em ordem decrescente
while (numeroFim >= numeroInicio) :
   print "\t ",numeroFim;
   numeroFim-=1;

