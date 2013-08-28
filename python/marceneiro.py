# -*- coding: utf-8 -*-

# Programa Python otimiza o trabalho do Marceneiro, uma vez definido o tamanho da peça (pedaço) o
# programa calculas quantas peças dentro uma metragem maior (taboas). Dessa forma o Marceiro
# pode escolher qual a melhor metragem de taboa.
#
# Acesse e execute esse código Python em: http://pythonfiddle.com/calculo-marceneiro-ap/
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

pedaco = 45;

# Procedimento recebe o tamanho da taboa (em centímetros), calcula quantas peças podem
# cortadas e quanto sobra.
# Início do procedimento
def calcularPedacosPorMetros(taboa):
    global pedaco;

    if (taboa <= 0):
        print "Valor inválido, entre com maior que 0!";
    else:
        pedacosPorMetros = taboa / pedaco;
        print "Quantos pedaços existem por ", (taboa/100.0), " metros? ", pedacosPorMetros, " peças";

        sobras = taboa % pedaco;
        print "Qtde sobra por ", (taboa/100.0),"m: ", sobras,"cm";
# Fim do procedimento


print "Cada peça tem ", pedaco, "cm\n";

calcularPedacosPorMetros(100);
calcularPedacosPorMetros(400);
calcularPedacosPorMetros(500);
calcularPedacosPorMetros(600);
calcularPedacosPorMetros(1000);

