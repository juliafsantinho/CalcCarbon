package br.com.calcCarbon.projeto;

public class Indicacoes extends Carbono {
	
	public Indicacoes (String nome) {
		System.out.println("\n///////////////////////////////////////////////////////////////////////////////////");
		System.out.println(nome + ", muito obrigade pelas suas respostas! Aqui est�o seus resultados: \n");
	}
	
	public void resultados () {
		System.out.println("A sua m�dia de emiss�es");
		System.out.println("Semanal �: " + super.getTotalSemanal() + " t de CO2 \n");
		System.out.println("Anual �: " + super.getTotalAnual() + " t de CO2 \n");
		System.out.println("Da vida at� agora �: " + super.getTotalVitalicio() + " t de CO2 \n");
	}
	
	public void indica��es (String nome) {
		if (super.getTotalAnual() <= 7.0) {
			System.out.println("Parab�ns! Voc� est� abaixo da m�dia de emiss�es anual dos brasileiros!!\n"
					+ "Continue assim, com cada um fazendo sua parte poderemos amenizar as mudan�as clim�ticas!");
		} else if (super.getTotalAnual() > 7.0 && super.getTotalAnual() <= 9.0) {
			System.out.println("Voc� est� dentro da m�dia de emiss�es anual dos brasileiros. O que acha de ajudar um pouco mais?\n"
					+ "Voc� sabia que a cada 7 �rvores, � poss�vel sequestrar 1 tonelada de carbono nos seus primeiros 20 anos de idade? \n"
					+ "Uma dica: voc� pode ajudar plantando algumas �rvores ou ajudando institui��es que fazem esse trabalho ;)");
		} else if (super.getTotalAnual() > 9.0) {
			System.out.println("Infelizmente suas emiss�es est�o acima da m�dia de emiss�es anual dos brasileiros :( \n"
					+ "O que acha de come�ar a mudar alguns h�bitos? Aqui v�o algumas dicas: \n"
					+ "Aderir ao movimento Segunda sem carne: 1 dia sem carne economiza 14Kg de CO2 emitidos\n"
					+ "Usar meios de transporte mais limpos: 1L de gasolina equivale a 1,6kg de CO2 emitidos\n"
					+ "Voc� pode ajudar institui��es que contribuem para amenizar as consequ�ncias das mudan�as clim�ticas");
		}
	}
}
