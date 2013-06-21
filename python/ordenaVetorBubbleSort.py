# -*- coding: utf-8 -*-

# Programa Python utiliza a entrada via teclado para criar e preencher um array de inteiros.
# Depois de preencher o array, o programa coloca os números contidos no array em ordem
# numérica natural (ascendente).
# 
# Na computação existem vários algoritmos para ordenação dos dados. As diferenças são 
# basicamente: complexidade, consumo de memória e tempo de processamento.
# 
# Nesse programa utilizamos o algoritmo Bubble Sort. Um algoritmo relativamente simples,
# com a performance satisfatória quando o array não tem uma capacidade muito grande.
#   - uso de procedimentos para organizar o código;
#   - uso de algoritmos para resolver o problema de ordenação de dados;
#   - demonstrar como implementar o algoritmo Bubble Sort em Python;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# Procedimento responsável preencher o array a partir dos dados coletados via teclado.
# Início do procedimento
def preenche(numeros, tamanho):
    for i in range (0, tamanho):
        valor = int(raw_input("Informe o número " + str(i+1) + "\n"));
        numeros.append(valor);
# Fim do procedimento

# Procedimento responsável por imprimir os dados contidos no array.
# Início do procedimento
def imprime(numeros):
    print str(numeros)[1:-1], "\n";
# Fim do procedimento

# Procedimento responsável por ordenar o array, utilizando o algoritmo Bubble Sort.
# No fim do procedimento os números contidos no array estarão em ordem numérica.
# Início do procedimento
def ordena(numeros):
    houveTroca = True;

    while (houveTroca):
        houveTroca = False;
        for i in range(0, len(numeros)-1):
            # compara o elemento atual (i) c/ o proximo (i+1)
            if (numeros[i] > numeros[i+1]):
                #faz a troca
                aux = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = aux;

                #indica que o array deve ser analisado novamente (while)
                houveTroca = True;

# Fim do procedimento

tamanhoArray = int(raw_input("Indique o tamanho do array ...\n"));
vetor = [];

preenche(vetor, tamanhoArray);

print "\nConteúdo do array antes de ordenar...";
imprime(vetor);

# coloca os valores do array em ordem numérica (ascende)
ordena(vetor);

print "\nConteúdo do array depois de ordenar...";
imprime(vetor);

