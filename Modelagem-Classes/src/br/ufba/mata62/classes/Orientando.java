package br.ufba.mata62.classes;

import java.util.List;

import br.ufba.mata62.classes.papel.Orientado;
import br.ufba.mata62.classes.papel.Orientador;

public class Orientando extends Discente implements Orientado {
	
	private Professor orientador;

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	@Override
	public Trabalho listarInformacoesTrabalhoSemestre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarVisibilidadePerfil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarInformacoesTrabalho() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificarNotificacoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void responderComentariosOrientador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void submeterTrabalhoFinal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void combinarReuniao(List<Orientador> orientadores) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verApresentacoesAgendadasPorOrientador(Orientador orientador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sugerirHorarioApresentacao(String horario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verInformacaoBancaOrientadora(Trabalho trabalho) {
		// TODO Auto-generated method stub
		
	}
}
