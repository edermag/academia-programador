# -*- coding: utf-8 -*-

# Programa Python simula o sorteio e aposta da Mega Sena.
# O programa sorteia seis números randomicos, sem repetição. O usuário entra com seis números
# de sua aposta. Por fim o programa avalia quantos acertos o usuário obteve!
#
# Objetivos:
#   - exercício de lógica;
#   - usar a entrada de dados via teclado;
#   - uso de funções para organizar o código;
#   - uso dos comandos de repetição for e while.
#   - uso da API do Python para geração de números randômicos.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

from random import randint;
import sys;

NUMERO_DEZENAS = 6;

# Função indica se o n existe no array numeros.
# Início da função
def existeNumero(numeros, n): 
    return n in numeros;
# Fim da função

# Função comparada cada número apostado, com os números sorteados.
# Por fim retorna a quantidade de acertos.
# Início da função
def contaAcertos(sorteio, aposta):
    global NUMERO_DEZENAS;
    acertos = 0;
    for i in range(0, NUMERO_DEZENAS):
        nroAposta = aposta[i];

        # compara cada nro apostado com os sorteados
        if (existeNumero(sorteio, nroAposta)):
            acertos += 1;

    return acertos;
# Fim da função

# Função retorna uma array com 6 números gerados randomicamente (API do Python),
# sem duplicidade, representando o sorteio da megasena.
# Início da função
def sorteaSena():
    global NUMERO_DEZENAS;
    resultado = [];
    
    for i in range(0, NUMERO_DEZENAS):
        repetido = False;

        # Python não possui do while...
        while True:
            sorteado = randint(1, 60); #nro aleatório de 1 a 60
            if not existeNumero(resultado, sorteado):
                break;

        resultado.append(sorteado);

    return resultado;
# Fim da função


sorteio = sorteaSena();
aposta = [];

# trecho processa a aposta
print "Faça sua aposta: ";

for i in range (0, NUMERO_DEZENAS):

    while True:
        nroAposta = int(raw_input("Informe a dezena "+ str(i+1) +": "));
        if (nroAposta <= 0):
            print "Número inválido, aposta cancelada!";
            sys.exit(); # encerra o programa

        if (existeNumero(aposta, nroAposta)):
            print "Ops, número repetido!";
        else:
            break;

    aposta.append(nroAposta);

print "\nConfira sua aposta: ", str(aposta)[1:-1]

print "\nResultado do sorteio: ", str(sorteio)[1:-1]

nroAcertos = contaAcertos(sorteio, aposta);
print "\nNúmero de acertos: ", nroAcertos;

if nroAcertos == 4:
    print "Parabéns. Você acertou a quadra!";
elif nroAcertos == 5:
    print "Parabéns. Você acertou a quina!";
elif nroAcertos == 6:
    print "Parabéns. Você é campeão da MegaSena!";
else:
    print "Não foi dessa vez. Tente novamente!";
