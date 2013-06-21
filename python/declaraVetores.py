# -*- coding: utf-8 -*-

# Programa Python demonstra como declarar e navegar vetores de caracteres.
# Em Python um array é na verdade uma lista que pode conter diferente tipos de objetos.
# Para adicionar um elemento usamos a função append. Os elementos podem ser acessados 
# via index (o primeiro indice é 0).
#
# Objetivos:
#   - uso de arrays;
#
# Módulo: Lógica de programação
# Author: Eder Magalhães

numeros = [4, 5, 3, 2, 1]; # cria o array com os dados

algunsPares = [];
algunsPares.append(4);
algunsPares.append(6);
algunsPares.append(8);
algunsPares.append(10);
algunsPares.append(12);
algunsPares.append(14);
algunsPares.append(16);
algunsPares.append(algunsPares[6] + 2); # 18
algunsPares.append(algunsPares[4] * 2);

# insere item no começo do array, os elementos são realocados
algunsPares.insert(0, 2);

qtd = 100;
multiplos2 = [];

# carrega o array via for
for  i in range(0, qtd):
    multiplos2.append((i+1) * 2);

palavra = ['P', 'y', 't', 'h', 'o', 'n'];
outraPalavra = ['O','l','a'];

# é muito simples somar o conteúdo de 2 arrays em outro!
frase = outraPalavra + palavra;

arrayVazio = [];

print 'Pronto, criamos alguns vetores no Python!';

