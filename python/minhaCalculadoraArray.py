# -*- coding: utf-8 -*-

# Programa Python implementa uma calculadora, com uma função para cada operação básica.
# Objetivos:
#   - uso de funções, variáveis e escopo;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# Soma todos os elementos contidos no array.
def somar(numeros):
    # é possível utilizar uma função pré-definida do python
    return sum(numeros);

# Considera o 1o elemento e subtrai o restante.
def subtrair(nros):
    if len(nros) == 0:
        return 0;

    resultado = nros[0];

    for n in range(1, len(nros)):
        resultado -= nros[n];
    return resultado;

x = [10, 20, 5];
totalSoma = somar(x);
print "Resultado da 1a soma: ", totalSoma;

totalSoma = somar([2, 3]);
print "Resultado da 2a soma: ", totalSoma;

y = []; # array vazio
print "Resultado da 3a soma: ", somar(y);

w = [5, 3, 1];
totalSubtrair = subtrair(w);
print "Resultado da 1a subtração: ", totalSubtrair;

totalSubtrair = subtrair([50, 25, 30, 5]);
print "Resultado da 2a subtração: ", totalSubtrair;

# array vazio
print "Resultado da 3a subtração: ", subtrair([]);

