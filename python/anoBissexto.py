# -*- coding: utf-8 -*-

# Programa Python define uma função para verificar se um determinado ano é ou não Bissexto.
# Objetivos:
#   - uso de funções;
#   - uso de repetições com o comando for in.
#
# Acesse e execute esse código Python em: http://pythonfiddle.com/ano-bissexto-ap/
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

#Função recebe o argumento ano e retorna o valor booleano indicando se é ou não bissexto.
def ehBissexto(ano):
    return ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0;

#entrada do programa, faz o laço considerando os anos de 2005 até 2015
for anoInformado in range(2005, 2015):
    resultado = ehBissexto(anoInformado);
    print "Ano ",anoInformado," é bissexto? ",resultado;

