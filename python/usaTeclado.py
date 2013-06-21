# -*- coding: utf-8 -*-

# Programa Python utiliza entrada de informações pelo teclado.
# Objetivos:
#   - uso entrada pelo teclado e printf.
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

# pede para o usuário entrar com o nome, idade e salario da linha de comando
nome = raw_input("Informe um nome (String) qualquer, depois precione ENTER...\n");
idade = int(raw_input("Agora informe a idade (int)...\n"));
salario = float(raw_input("E pra encerrar informe o salario (double)...\n"))

# imprime o conteudo informado pelo usuário
print "-" * 30
print "Nome informado: %s" % nome
print "Idade informada: %d" % idade
print "Salario informado: %.2f" % salario

