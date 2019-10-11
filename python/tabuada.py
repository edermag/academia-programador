# Author: Samuel Olimpio


def calculaTabuada(n):
        print ("Calculando tabuada do ", n, "...");

        for multiplicador in range(1, 11):
            resultado = multiplicador * n;
            print (n, " x ", multiplicador, " = ", resultado);

numero = int(input("Informe o número para calcular a tabuada: "));
calculaTabuada(numero);

#Obs. nesse programa é possivel calcular qualquer numero para a tabuada :D
