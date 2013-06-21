# -*- coding: utf-8 -*-

# Programa Python demonstra o uso de operadores em variáveis.
#
# Objetivos:
#   - declaração de variáveis;
#   - uso de operadores básicos;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

x = 5 + 3 * 4 / 2 - 1;
print "5 + 3 * 4 / 2 - 1 = ", x;

a, b, c = 5, 2, 2 * 2;

resultado1 = a * 6 + b * 5;
print "5 * 6 + 2 * 5 = ", resultado1;

resultado2 = a * (6 + b) * 5;
print "5 * (6 + 2) * 5 = ", resultado2;

resultado3 = a * (6 + b * 5);
print "5 * (6 + 2 * 5) = ", resultado3;

resultado4 = 20 / b * 3;
print "20 / 2 * 3 = ", resultado4;

# divisao de inteiro, gera inteiro
divInteiro = 7 / 2;
print "7 / 2 = ", divInteiro;

restoDivInteiro = 7 % 2;
print "resto de 7 / 2 = ", restoDivInteiro;

# divisao de float, gera float
divFlutuante = float(7.0) / 2;
print "7.0 / 2 = ", divFlutuante;

x += 1;
print "Incremento de x = ", x
