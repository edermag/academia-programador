# -*- coding: utf-8 -*-

# Programa Python calcula a potência a partir de um nro base e expoente.
# O calcula de potência desse programa só se aplica a nros positivos.
#
# Demonstra como utilizar recursividade.
#
# Objetivos:
#   - exercício de lógica;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

def calculaPotencia(exp, base):
    if (exp == 0):
        return 1;

    exp -= 1;
    return base * calculaPotencia(exp, base);

base = int(raw_input("Informe a base: "));
expoente = int(raw_input("Informe o expoente: "));

if (base < 0):
    print "Programa só calcula com base positiva!";
else:
    resultado = calculaPotencia(expoente, base);
    print "\nResultado de ", base, " ^ ", expoente, " = ", resultado;

