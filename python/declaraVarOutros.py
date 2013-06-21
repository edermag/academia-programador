# -*- coding: utf-8 -*-

# Programa Python demonstra como declarar variáveis do tipo String e Boolean.
# Note que em Python não é necessário definir a variável e seu tipo!
# Python é uma linguagem tipada dinamicamente.
#
# Objetivos:
#   - declaração de variáveis que armazenam texto e boolean;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

pagamentoAprovado = True;

letraA = 'a'; #String com aspas simples

palavra = 'Python';

print "pagamentoAprovado = ", pagamentoAprovado;
print "letraA = ", letraA;
print "palavra = ", palavra;
print;

qdteProdutos = 0;

# atribui a condição boolean
temEstoque = qdteProdutos > 0;

# pega o codigo ASCII de 'a' e soma 1
letraB = chr(ord(letraA)+1);

#converte inteiro para string
letraC = chr(99);

frase = "Ola "+palavra; # o operador '+' concatena conteúdo das strings

print "temEstoque ", temEstoque
print "letraB = ", letraB
print "letraC = ", letraC
print "frase = ", frase
print

outraFrase = "Conteudo 'entre aspas'";
print "outraFrase = ", outraFrase;
print "Qtde de letras na outraFrase: ", len(outraFrase);
print;

texto = """Uma frase no começo.
Outra no fim...""";

print "texto = ", texto, "\n";

nada = None; #String (objeto) nula
print "nada = ", nada;
