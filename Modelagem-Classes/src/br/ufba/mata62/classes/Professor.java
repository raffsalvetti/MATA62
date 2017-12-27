package br.ufba.mata62.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;

import br.ufba.mata62.classes.papel.Avaliador;
import br.ufba.mata62.classes.papel.Orientado;
import br.ufba.mata62.classes.papel.Orientador;

public class Professor extends Doscente implements Avaliador, Orientador {
	private List<Trabalho> trabalhos = new ArrayList<>();

	@Override
	public List<Avaliacao> getFuturasAvaliacoes(int semestre) {
		List<Avaliacao> avaliacaos = new ArrayList<>();
		for (Trabalho t : trabalhos) {
			if(t.getSemestre() == semestre)
				avaliacaos.add(t.getAvaliacao());
		}
		return avaliacaos;
	}

	@Override
	public List<Orientado> listarOrientandosPorEtapaDeProjeto(EtapaProjeto etapaProjeto) {
		List<Orientado> orientandos = new ArrayList<>();
		for (Trabalho t : trabalhos) {
			if(t.getEtapaProjeto() == etapaProjeto)
				orientandos.add(t.getOrientado());
		}
		return orientandos;
	}

	@Override
	public void verInformacoesTrabalhoSemestreCorrente(List<Orientado> orientados) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verInformacaoEstudanteETrabalhoSemestreAnteriorCronologico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificarNotificacaoOrientado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificarNotificacaoEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comentarTrabalho(Trabalho trabalho) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autorizarApresentacaoMonografia(Trabalho trabalho) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BancaAvaliadora convocarBancaOrientadora() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agendarReuniao(List<Orientado> orientados) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avaliarTrabalho(Trabalho trabalho) {
		// TODO Auto-generated method stub
		
	}
}
