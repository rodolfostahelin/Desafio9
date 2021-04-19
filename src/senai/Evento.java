package senai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Evento {

	private String nome;
	private LocalDate data;
	private Usuario organizador;
	private Usuario[] participantes;
	private int posicaoParticipantes = 0;
	private String descricaoEvento;
	
	public Evento(String nome, LocalDate data, Usuario organizador, String descricaoEvento) {
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.participantes = new Usuario[10];
		this.descricaoEvento = descricaoEvento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public void setData(String data) {
		String format = "dd/MM/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		this.data = LocalDate.parse(data, formatter);
	}
	
	public Usuario getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	public void addParticipante( Usuario participante) {
		this.participantes[this.posicaoParticipantes] = participante;
		this.posicaoParticipantes++;
	}
	public void removeParticipante(Usuario participante) {
		for( int i = 0; i < participantes.length; i ++){
        	if (participantes[ i ] == participante ){
        		this.posicaoParticipantes = i;
        		this.participantes[this.posicaoParticipantes] = null;
        	}
        	    
        }
	}
	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", data=" + data + ", organizador=" + organizador + ", participantes="
				+ Arrays.toString(participantes) + "]";
	}
	
}
