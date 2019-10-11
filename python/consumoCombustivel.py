# -*- coding: utf-8 -*-

# Programa Python calcula o consumo médio de um carro (km por hora) a partir das informações:
#   - quantidade de gasolina no tanque;
#   - quantidade de horas percorridas;
#   - velocidade média;
#
# Acesse e execute esse código Python em: http://pythonfiddle.com/consumo-combustivel-ap/
#
# Objetivos:
#   - exercício de lógica;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

Gasolina = float(input("Informe a quantidade de gasolina no tanque: "));

HP = int(input("Ok, agora informe quantas horas foram precorridas: "));

VM = int(input("Por fim me diga qual era a velocidade média: "));

if (Gasolina < 1 or HP < 1 or VM < 1):
    print ("Entre com dados validos!");
else :
    kmMedia = (VM * HP)/float(Gasolina);

    print ("\nO consumo médio foi de ", kmMedia, " km percorridos por litro");

