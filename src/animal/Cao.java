package animal;

import java.time.LocalDate;

public class Cao extends Animal{
	
	public Cao(String nome, LocalDate data, double peso, String raca) {
		super(nome, data, peso, raca);
	}
	
	@Override
	public String toString() {
		return "Cão com nome: "+nome+", peso: "+peso+", raça: "+raca+" e data de nascimento: "+dataNascimento;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Auauauau");
	}
}
