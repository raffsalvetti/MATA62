package br.ufba.mata62.classes.papel;

import java.util.ArrayList;
import java.util.List;

import br.ufba.mata62.classes.BancaAvaliadora;
import br.ufba.mata62.classes.EtapaProjeto;
import br.ufba.mata62.classes.Orientando;
import br.ufba.mata62.classes.Trabalho;

public interface Orientador {
	List<Orientando> orientandos = new ArrayList<>();
	List<Orientado> listarOrientandosPorEtapaDeProjeto(EtapaProjeto etapaProjeto);
	void verInformacoesTrabalhoSemestreCorrente(List<Orientado> orientados);
	void verInformacaoEstudanteETrabalhoSemestreAnteriorCronologico();
	void verificarNotificacaoOrientado();
	void verificarNotificacaoEmail();
	void comentarTrabalho(Trabalho trabalho);
	void autorizarApresentacaoMonografia(Trabalho trabalho);
	BancaAvaliadora convocarBancaOrientadora();
	void agendarReuniao(List<Orientado> orientados);
}
