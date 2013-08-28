# -*- coding: utf-8 -*-

# Programa Python demonstra opções de literais suportas pela linguagem.
# Python permite trabalhar com números utilizando literais decimal, octal e binária.
# Com strings Python suporta unicode.
#
# Objetivos:
#   - uso de literais suportadas pelo Python;
#
# Acesse e execute esse código Python em: http://pythonfiddle.com/tipos-literais-ap/
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

decimal = 10; # literal decimal
octal = 012; # literal octal, base 8
hexadecimal = 0xA; # literal hexadecimal, base 16
binario = 0b1010; # literal binaria

print "octal = ", octal; # imprime como decimal
print "hexadecimal = ", hexadecimal; # tb imprime como decimal
print "binario = ", binario

print "10 em hexadecimal: ", hex(decimal);
print "10 em binário: ", bin(decimal);
print "10 em octal: ", oct(decimal);

letraA = chr(65); # codigo ASCII
letraB = 'B'; # literal char
letraC = u'\u0043'; # literal Unicode
especial = u'\u262F';

print "letraA = ", letraA;
print "letraB = ", letraB
print "letraC = ", letraC
print "especial = ", especial

