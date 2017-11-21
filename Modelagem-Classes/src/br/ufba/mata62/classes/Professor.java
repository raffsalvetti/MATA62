package br.ufba.mata62.classes;

import java.util.ArrayList;
import java.util.List;

import br.ufba.mata62.classes.papel.Avaliador;
import br.ufba.mata62.classes.papel.Orientador;

public class Professor extends Doscente implements Avaliador, Orientador {
	private List<Orientando> orientandos = new ArrayList<>();

	@Override
	public List<Avaliacao> getFuturasAvaliacoes(int semestre) {
		List<Avaliacao> avaliacaos = new ArrayList<>();
		for (Orientando o : orientandos) {
			if(o.getTrabalho().getSemestre() == semestre)
				avaliacaos.add(new Avaliacao().setAluno(o).setTrabalho(o.getTrabalho()));
		}
		return avaliacaos;
	}

	@Override
	public List<Orientando> listarOrientandosPorEtapaDeProjeto(EtapaProjeto etapaProjeto) {
		List<Orientando> orientandos = new ArrayList<>();
		for (Orientando orientando : this.orientandos) {
			if(orientando.getTrabalho().getEtapaProjeto() == etapaProjeto)
				orientandos.add(orientando);
		}
		return orientandos;
	}
}
