package br.com.calcCarbon.projeto;

import java.util.Scanner;

public class CalcCarbon {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		
		// -------- SE��O CADASTRO ------------
		/*Cadastro.bemVindo();
		Cadastro.scanner();*/
		
		
		// -------- SE��O ALIMENTA��O ----------
		Carne c = new Carne();
	
		c.secaoCarne();
		
		int i = 0;
		while (i == 0) {
			
			c.pergunta1();
			c.setDecisao(leia.nextInt());
			
			if (c.getDecisao() != 1 && c.getDecisao() != 2) {
				System.out.println("Op��o inv�lida, tente novamente! \n");
				i = 0;
			} else {
				i++;
			}	
		}
		
		c.pergunta2();
		c.setQntCarne(leia.nextDouble());
		c.calculo();
		
		//--------------- SECAO ENERGIA --------------
		
		
		// -------------------------------------------
		// ------------- SECAO TRANSPORTE ------------
		
		// -------------------------------------------
		// ------------- SECAO FINAL -----------------
		
		
		leia.close();
	}
}
