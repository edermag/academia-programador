# -*- coding: utf-8 -*-

# Programa Python demonstra como é possível utilizar uma função (function)
# para calcular números divisiveis em um determinado range de valores.
#
# Lembre-se que em Python a identação é fundamental para delimitar início e fim dos blocos.
#
# Objetivos:
#   - uso de funções para realizar um cálculo;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# inicio da função
def calculaDivisiveis(minimo, maximo, divisor):
    contador = 0;

    for n in range(minimo, maximo+1):
        if n % divisor == 0:
            contador += 1;

    return contador;
# fim da função

valorMinimo = 10;
valorMaximo = 1000;
div = 10;

print "Identificando divisiveis por 10 entre 100 e 1000";

# chama a função
total = calculaDivisiveis(valorMinimo, valorMaximo, div);

print "\nQtos números são divisiveis por", div, " ? ", total;

print "\nIdentificando divisiveis por 2 entre 1 e 10"

# chama função, com argumentos diferentes, na hora de imprimir
print "\nQtos números são divisiveis por 2 ? ", calculaDivisiveis(1, 10, 2);

