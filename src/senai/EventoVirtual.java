package senai;

import java.time.LocalDate;

public class EventoVirtual extends Evento {
	
	private String url;

	public EventoVirtual(String nome, LocalDate data, Usuario organizador, String descricaoEvento, String url) {
		super(nome, data, organizador, descricaoEvento);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "EventoVirtual [url=" + url + "]";
	}
	
	

}
