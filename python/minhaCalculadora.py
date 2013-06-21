# -*- coding: utf-8 -*-

# Programa Python implementa uma calculadora, com uma função para cada operação básica.
# Objetivos:
#   - uso de funções, variáveis e escopo;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

def somar(x, y):
    resultado = x + y;
    return resultado;

def subtrair(x, y):
    resultado = x - y;
    return resultado;

def dividir(y, x):
    div = y / x;
    return div;

def multiplicar(a, b):
    return a * b;


x = somar(10, 20);
print "Resultado da 1a soma: ", x

y = somar(30, 40);
print "Resultado da 2a soma: ", y

total = somar(x, y);
print "Resultado final: ", total

a = subtrair(50, 2);
print "Resultado da divisão: ", a

w = multiplicar(15, 3);
print "Resultado da multiplicação: ", w

z = subtrair(5, 7);
print "Resultado da subtração: ", z;
