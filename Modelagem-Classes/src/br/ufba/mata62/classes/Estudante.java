package br.ufba.mata62.classes;

import java.util.List;

public class Estudante extends Discente {
	public List<Estudante> getListaTrabalhosOrientadosSemestreCorrente() {
		return getListaTrabalhosOrientados(true);
	}
	
	public List<Estudante> getListaTrabalhosOrientadosSemestresPassados() {
		return getListaTrabalhosOrientados(false);
	}
	
	private List<Estudante> getListaTrabalhosOrientados(boolean semestreCorrente) {
		return null;
	}

	
	public List<Trabalho> buscarAreaInteresseTrabalho(String areaInteresse){
		return null;
	}
}
