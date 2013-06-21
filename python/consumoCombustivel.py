# -*- coding: utf-8 -*-

# Programa Python calcula o consumo médio de um carro (km por hora) a partir das informações:
#   - quantidade de gasolina no tanque;
#   - quantidade de horas percorridas;
#   - velocidade média;
#
# Objetivos:
#   - exercício de lógica;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

tanqueGasolina = int(raw_input("Informe a quantidade de gasolina no tanque: "));

horasPercorridas = int(raw_input("Ok, agora informe quantas horas foram precorridas: "));

velocidadeMedia = int(raw_input("Por fim me diga qual era a velocidade média: "));

if (tanqueGasolina < 1 or horasPercorridas < 1 or velocidadeMedia < 1):
    print "Entre com dados validos!";
else :
    #calculo para descobrir o valor
    kmMedia = velocidadeMedia * horasPercorridas / float(tanqueGasolina);

    print "\nO consumo médio foi de ", kmMedia, " km percorridos por litro";

