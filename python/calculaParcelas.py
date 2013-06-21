# -*- coding: utf-8 -*-

# Programa Python calcula simula o valor de parcelamento de uma compra, a partir de um preço e nro total de parcelas.
#
# Objetivos:
#   - uso de comando for (repetição);
#   - operações matemáticas simples;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

preco = 1000.2;
totalParcelas = 10;
intervaloDias = 30;

# exibe parcelas sem acrescimento
print "Pagamento de ", preco, " em ", totalParcelas, " (sem ascrecimo)";

for parcela in range(1, totalParcelas+1):
    valorParcela = preco / parcela;
    dias = intervaloDias * parcela;
    print "\tparcela %02d no valor de %.2f, pagto em %s dias" % (parcela, valorParcela, dias);

taxaMes = .5;
# reajusta o preco de acordo com a taxa        
juros = taxaMes * totalParcelas;
preco += preco * (juros / 100);

# exibe parcelas com acrescimento
print "\nPagamento de ", preco, " em ", totalParcelas, " (com ascrecimo de ", juros, "%)";

for parcela in range(1, totalParcelas+1):
    valorParcela = preco / parcela;
    dias = intervaloDias * parcela;
    print "\tparcela %02d no valor de %.2f, pagto em %s dias" % (parcela, valorParcela, dias);

