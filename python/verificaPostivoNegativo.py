# -*- coding: utf-8 -*-

# Programa Python define e usa uma função boolean, que indica se o número é maior ou igual a zero.
# Objetivos:
#   - uso de variáveis, funções e com condição boolean;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

def ehMaiorQueZero(n):
    return n >= 0;

a = 50;
resultado = ehMaiorQueZero(a);

print "O número ", a, " é positivo? ", resultado

b = -5;
print "O número ", b, " é positivo? ", ehMaiorQueZero(b)
print "O número ", b, " é negativo? ", not ehMaiorQueZero(b)

