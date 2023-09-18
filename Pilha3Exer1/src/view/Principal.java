package view;

import controller.PilhaController;

public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaController pilha = new PilhaController();		
	        int[] vetor = {0,5,7,-4,3,5,-2,-1,10,4,3,-6,2,-9,1,-5};
	        pilha.percorreVet(vetor);
	        System.out.println("Total de valores na pilha: " + PilhaController.quantidadePilha());
	    }
	
	}


