package animal;

import java.time.LocalDate;

public class Rato extends Animal{
	
	public Rato(String nome, LocalDate data, double peso, String raca) {
		super(nome, data, peso, raca);
	}
	
	public void roer() {
		System.out.println("O "+nome+" está roendo algo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("chi-chi, chi-chi");
	}
	
	@Override
	public String toString() {
		return "Rato com nome: "+nome+", peso: "+peso+", raça:"+raca+" e data de nascimento: "+dataNascimento;
	}
	
}
