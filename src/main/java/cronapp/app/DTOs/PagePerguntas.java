package cronapp.app.DTOs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2017-09-27
 *
 */

public class PagePerguntas implements Serializable {
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.lang.String perguntas;

	private List<PageOpcoes> opcoes;

	public PagePerguntas() {
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(java.lang.String perguntas) {
		this.perguntas = perguntas;
	}

	public List<PageOpcoes> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(List<PageOpcoes> opcoes) {
		this.opcoes = opcoes;
	}

}
