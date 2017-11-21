package br.ufba.mata62.classes.papel;

import java.util.ArrayList;
import java.util.List;

import br.ufba.mata62.classes.EtapaProjeto;
import br.ufba.mata62.classes.Orientando;

public interface Orientador {
	List<Orientando> orientandos = new ArrayList<>();
	List<Orientando> listarOrientandosPorEtapaDeProjeto(EtapaProjeto etapaProjeto);
}
