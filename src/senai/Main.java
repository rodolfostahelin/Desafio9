package senai;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Sistema de Eventos ---");
		Usuario usuario1 = new Usuario("João");
		Usuario usuario2 = new Usuario("Maria");
		Usuario usuario3 = new Usuario("Guilherme");
		Usuario usuario4 = new Usuario("Roberto");
		Usuario usuario5 = new Usuario("Rodolfo");
		
		System.out.println("--- Evento 1 ---");
		EventoPresencial evento1 = new EventoPresencial("Aula de Culinária",
				LocalDate.of(2020, 8, 10), usuario1, "Pensa que só a sua vó ou a Ana Maria podem te ensinar a fazer comida? Venham conhecer a aula de culinária em Java", "SENAI/SC", 20);
		evento1.addParticipante(usuario2);
		evento1.setData("12/10/2020");
		System.out.println(evento1);
		
		System.out.println("--- Evento 2 ---");
		EventoVirtual evento2 = new EventoVirtual("Como plantar dinheiro",
				LocalDate.of(2020, 9, 7), usuario2, "http://eventovirtual.org.br/123", "Já pensou em ficar rico plantando seu dinheiro? Nesse evento falaremos sobre técnicas milenares de crescimento de dinheiro sem muito esforço");
		evento2.addParticipante(usuario2);
		
		evento2.addParticipante(usuario1);
		evento2.addParticipante(usuario3);
		evento2.addParticipante(usuario4);
		evento2.addParticipante(usuario5);
		evento2.removeParticipante(usuario1);
		evento2.removeParticipante(usuario4);
		
		System.out.println(evento2);
		
		
		System.out.println("--- FIM ---");
		
	}

}
