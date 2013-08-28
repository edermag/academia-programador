# -*- coding: utf-8 -*-

# Programa Python retorna o dia da semana em extenso. Domingo igual 1 e Sábado 7.
# Python não possui switch, utilizo if c/ elif no lugar.
# Objetivos:
#   - uso de multiplas condições boolean;
#
# Acesse e execute esse código Python em: http://pythonfiddle.com/converte-dia-semana-ap/
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# modifique essa variável para testar o programa
diaSemana = 2;
dia = "";

if diaSemana == 1:
    dia = "Domingo";
elif diaSemana == 2:
    dia = "Segunda-feira";
elif diaSemana == 3:
    dia = "Terça-feira";
elif diaSemana == 4:
   dia = "Quinta-feira";
elif diaSemana == 5:
   dia = "Quarta-feira";
elif diaSemana == 6:
   dia = "Sexta-feira";
elif diaSemana == 7:
   dia = "Sabado";
else:
   dia = "Dia invalido!";

# complementa, armazena se é dia útil ou fim de semana
if diaSemana in (2, 3, 4, 5):
   dia += " (dia útil)"
elif diaSemana in (1,7):
   dia += " (fim de semana)"

print dia

