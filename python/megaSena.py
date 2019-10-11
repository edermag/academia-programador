from random import randint;
import sys;

NUMERO_DEZENAS = 6;

o
def existeNumero(numeros, n): 
    return n in numeros;


def contaAcertos(sorteio, aposta):
    global NUMERO_DEZENAS;
    acertos = 0;
    for i in range(0, NUMERO_DEZENAS):
        nroAposta = aposta[i];

        if (existeNumero(sorteio, nroAposta)):
            acertos += 1;

    return acertos;

def sorteaSena():
    global NUMERO_DEZENAS;
    resultado = [];
    
    for i in range(0, NUMERO_DEZENAS):
        repetido = False;


        while True:
            sorteado = randint(1, 60); 
            if not existeNumero(resultado, sorteado):
                break;

        resultado.append(sorteado);

    return resultado;

sorteio = sorteaSena();
aposta = [];

print ("Faça sua aposta: ");

for i in range (0, NUMERO_DEZENAS):

    while True:
        nroAposta = int(input("Informe a dezena "+ str(i+1) +": "));
        if (nroAposta <= 0):
            print ("Número inválido, aposta cancelada!");
            sys.exit(); 

        if (existeNumero(aposta, nroAposta)):
            print ("Ops, número repetido!");
        else:
            break;

    aposta.append(nroAposta);

print ("\nConfira sua aposta: ", str(aposta)[1:-1]);

print ("\nResultado do sorteio: ", str(sorteio)[1:-1]);

nroAcertos = contaAcertos(sorteio, aposta);
print ("\nNúmero de acertos: ", nroAcertos);

if nroAcertos == 4:
    print ("Parabéns. Você acertou a quadra!");
elif nroAcertos == 5:
    print ("Parabéns. Você acertou a quina!");
elif nroAcertos == 6:
    print ("Parabéns. Você é campeão da MegaSena!");
else:
    print ("Não foi dessa vez. Tente novamente!");
