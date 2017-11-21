package br.ufba.mata62.classes;

import java.util.ArrayList;
import java.util.List;

public class FormularioAvaliacao {
	private List<ItemFormularioAvaliacao> itensAvaliados = new ArrayList<>();

	public List<ItemFormularioAvaliacao> getItensAvaliados() {
		return itensAvaliados;
	}

	public void setItensAvaliados(List<ItemFormularioAvaliacao> itensAvaliados) {
		this.itensAvaliados = itensAvaliados;
	}
}
