package br.ufba.mata62.classes.papel;

import java.util.List;

import br.ufba.mata62.classes.Orientando;
import br.ufba.mata62.classes.Trabalho;

public interface Orientado {
	Trabalho listarInformacoesTrabalhoSemestre();
	void atualizarVisibilidadePerfil();
	void adicionarInformacoesTrabalho();
	void verificarNotificacoes();
	void responderComentariosOrientador();
	void submeterTrabalhoFinal();
	void combinarReuniao(List<Orientador> orientadores);
	void verApresentacoesAgendadasPorOrientador(Orientador orientador);
	void sugerirHorarioApresentacao(String horario);
	void verInformacaoBancaOrientadora(Trabalho trabalho);
}
