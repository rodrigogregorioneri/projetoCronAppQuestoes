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

public class PageOpcoes<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.lang.String opcao;

	public PageOpcoes() {
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getOpcao() {
		return opcao;
	}

	public void setOpcao(java.lang.String opcao) {
		this.opcao = opcao;
	}

}
