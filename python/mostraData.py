# -*- coding: utf-8 -*-

# Programa Python demonstra recuperar a data atual (máquina).
#
# Acesse e execute esse código Python em: http://pythonfiddle.com/mostra-data-ap/
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

from datetime import datetime;

hoje = datetime.now()

print "Data (original): %s" % hoje;
print "Data formatada: %s" % hoje.strftime("%d/%m/%Y");
print "Data outro formato: %s" % hoje.strftime("%m/%d/%y");

