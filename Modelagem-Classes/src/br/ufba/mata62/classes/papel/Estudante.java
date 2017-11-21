package br.ufba.mata62.classes.papel;

import java.util.List;

import br.ufba.mata62.classes.Orientando;
import br.ufba.mata62.classes.Trabalho;

public interface Estudante {
	List<Orientando> getListaTrabalhosOrientados(boolean semestreCorrente);
	List<Trabalho> buscarAreaInteresseTrabalho(String areaInteresse);
}
