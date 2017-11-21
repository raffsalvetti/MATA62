package br.ufba.mata62.classes.papel;

import java.util.List;

import br.ufba.mata62.classes.Avaliacao;

public interface Avaliador {
	List<Avaliacao> getFuturasAvaliacoes(int semestre);
}
