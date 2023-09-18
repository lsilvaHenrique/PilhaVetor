package controller;

import sp.fateczl.lucas.PilhaInt.PilhaInt;

public class PilhaController {

    private static PilhaInt pilha = new PilhaInt();

    public void percorreVet(int[] vetor) throws Exception {
        for (int i = 0; i < vetor.length; i++) {
            int valorAtual = vetor[i];
            if (valorAtual >= 0) {
                pilha.push(valorAtual);
            } else {
                if (!pilha.isEmpty()) {
                    int primeiro = pilha.pop();
                    if (!pilha.isEmpty()) {
                        int segundo = pilha.pop();
                        pilha.push(valorAtual);
                        pilha.push(primeiro + segundo);
                    } else {
                        pilha.push(valorAtual);
                        pilha.push(primeiro);
                    }
                } else {
                    pilha.push(valorAtual);
                }
            }
        }
    }

    public static int quantidadePilha() {
        int quantidade = 0;
        PilhaInt aux = new PilhaInt();
        while (!pilha.isEmpty()) {
            try {
				aux.push(pilha.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            quantidade++;
        }
        while (!aux.isEmpty()) {
            try {
				pilha.push(aux.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return quantidade;
    }

}


