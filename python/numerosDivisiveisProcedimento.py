# -*- coding: utf-8 -*-

# Programa Python demonstra como é possível utilizar um procedimento (procedure)
# para computar números divisiveis em um determinado range de valores.
#
# Lembre-se que em Python a identação é fundamental para delimitar início e fim dos blocos.
#
# Em Python diferente de uma função, o procedimento não indica retorno no final do bloco.
#
# Objetivos:
#   - uso de procedimento para computar instruções;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

contador = 0; # variável global

# inicio do procedimento
def imprimeDivisiveis(minimo, maximo, divisor):
    global contador; # indica o uso da variável global
    contador = 0;

    for n in range(minimo, maximo+1):
        if n % divisor == 0:
            contador += 1;
            print "\tO número ", n," é divisível por ",divisor
# fim do procedimento

valorMinimo = 10;
valorMaximo = 1000;
div = 10;

print "Identificando divisiveis por 10 entre 100 e 1000";

# chama a procedure
imprimeDivisiveis(valorMinimo, valorMaximo, div);

print "\nQtos números são divisiveis por", div, " ? ", contador;

print "\nIdentificando divisiveis por 2 entre 1 e 10"

# outra chamada, com argumentos diferentes
imprimeDivisiveis(1, 10, 2);

print "\nQtos números são divisiveis por 2 ? ", contador;
