# -*- coding: utf-8 -*-

# Programa Python calcula a taboada de um determinado número.
#
# Objetivos:
#   - exercício de lógica;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# Calcula da tabuada do número informado como argumento.
# Início do procedimento
def calculaTabuada(n):
    if (n <= 0):
        print "Informe um número válido para calcular a tabuada!";
    else :
        print "Calculando tabuada do ", n, "...";

        for multiplicador in range(1, 11):
            resultado = multiplicador * n;
            print n, " x ", multiplicador, " = ", resultado;
# Fim do procedimento

numero = int(raw_input("Informe o número para calcular a tabuada: "));
calculaTabuada(numero);

