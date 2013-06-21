# -*- coding: utf-8 -*-

# Programa Python utiliza a entrada via teclado para criar e preencher um array de inteiros.
# Depois de preencher o array, o usuário indica um dado valor para o programa descobrir
# a posição (indice) dele no array.
# Objetivos:
#   - uso do teclado;
#   - uso de array (vetor);
#   - uso do comando for (repetição) e if (condicional);
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# Função recebe o array e o valor. Objetivo é retornar qual o indice do valor no array.
# Caso o valor não seja encontrado retorna -1.
# Início da função
def obtemIndice(nros, valor):
     # poderia utilizar a função index do array, ex: nros.index(valor)
    for i in range(0, len(nros)):
        if valor == nros[i]:
            return i;
    return -1;
# Fim da função

tamanhoArray = int(raw_input("Indique o tamanho do array ...\n"));
numeros = [];

# preenche o array (teclado)
for r in range(0, tamanhoArray):
    valor = int(raw_input("Informe o número " + str(r+1) + "\n"));
    numeros.append(valor);

valorDescobrir = int(raw_input("Informe o valor (int) pra descobrir o indice\n"))
# verifica a posição
x = obtemIndice(numeros, valorDescobrir);
print "Qual a posicao de ", valorDescobrir, " no array? ", x;

