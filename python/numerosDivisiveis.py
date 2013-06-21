# -*- coding: utf-8 -*-

# Programa Python realiza comparações em um determinado range de números.
# Objetivos:
#   - uso de variáveis, while (repetição), if (condicional) e escopo;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

numeroDe = 100;
numeroAte = 2556;

pares = 0;
impares = 0;
divPorCinco = 0;

while (numeroDe <= numeroAte):
    if numeroDe % 2 == 0:
        pares += 1;
    else:
        impares += 1;

    if numeroDe % 5 == 0:
        divPorCinco += 1;

    numeroDe += 1;

print "Resumo de divisiveis entre ", numeroDe, " e ", numeroAte
print "\t- Números pares: ", pares
print "\t- Números impares: ", impares
print "\t- Números divisiveis por 5: ", divPorCinco

