# -*- coding: utf-8 -*-

# Programa Python demonstra como declarar e navegar vetores de caracteres.
# Um dos diferenciais do Python é a flexibilidade em lidar com vetores.
#
# Objetivos:
#   - uso de arrays que armazenam caracteres;
#   - uso do comando for para preencher arrays;
#   - uso da função xrange para definir os limites do for;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

vogais = [ 'a', 'e', 'i', chr(111), 'u' ];

# imprime o array de forma natural
print vogais;

# array inicialmente está vazio, é carregado no for abaixo
alfabetoMaiusculo = [];

for l in xrange(ord('Z'), ord('A')-1, -1):
    alfabetoMaiusculo.append(chr(l));

# usa a função join da string pra concatenar o conteúdo do array
print "Conteúdo do array alfabetoMaiusculo: ", ' '.join(alfabetoMaiusculo);

palavras = ["Programando", "arrays", "em", "Python"];

print "Conteúdo do array palavras: ", ' '.join(palavras);

