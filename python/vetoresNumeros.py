# -*- coding: utf-8 -*-

# Programa Python demonstra como declarar e navegar vetores de números.
# Um dos diferenciais do Python é a flexibilidade em lidar com vetores.
#
# Objetivos:
#   - uso de arrays que armazenam caracteres;
#   - uso do comando for para preencher e navegar em arrays;
#   - uso da função len, pra indicar o tamanho do array;
#   - uso da função range para definir os limites do for;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

numeros = [4, 5, 3, 2, 1];

print "Quantidade de elementos armazenados no array (vetor) numeros: ", len(numeros);

print "\nA seguir o conteúdo armazenado no array numeros:";

for i in range(0, len(numeros)):
    n = numeros[i]
    print "\t- posição ", i," do vetor numeros o conteúdo é: ",n;

print "\nOutra forma de apresentar os elementos do array numeros:";

# navega nos elementos em ordem inversa, do ultimo para o primeiro
for i in xrange(len(numeros)-1, -1, -1):
    n = numeros[i]
    print "\t- posição ", i," do vetor numeros o conteúdo é: ",n;

# como preencher um array com for em Python
outrosNumeros = [n for n in range(1,6)];

print "outrosNumeros = %s " % outrosNumeros;

# outra opção seria inverter a ordem do array, em Python isso é simples
outrosNumeros.reverse();

# imprime os dados do array sem mostrar []
print "outrosNumeros invertidos ",str(outrosNumeros)[1:-1];

