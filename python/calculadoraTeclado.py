# -*- coding: utf-8 -*-

# Programa Python implementa uma calculadora simples, com entrada via teclado.
# Objetivos:
#   - uso do teclado e múltiplas condições.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

x = int(raw_input("Informe o operando 1:\n"));

operacao = raw_input("Entre com a operacao, escolha os símbolos + - * /\n");

y = int(raw_input("Informe o operando 2:\n"));

if operacao == '+':
    resultado = x + y;
    nomeOperacao = "soma";
elif operacao == '-':
    resultado = x - y;
    nomeOperacao = "subtracao";
elif operacao == '*':
    resultado = x * y;
    nomeOperacao = "multiplicacao";
elif operacao == '/':
    resultado = x / y;
    nomeOperacao = "divisao";
else:
    resultado = 0;
    nomeOperacao = "operacao invalida";

print "Resultado da %s = %s" % (nomeOperacao, resultado);

