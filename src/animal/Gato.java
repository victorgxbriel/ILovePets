package animal;

import java.time.LocalDate;

public class Gato extends Animal{
	private String corPelagem;
	
	public Gato(String nome, LocalDate data, double peso, String raca, String cor) {
		super(nome, data, peso, raca);
		this.corPelagem = cor;
	}
	
	public String getCorPelagem() {
		return corPelagem;
	}
	
	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}
	
	public void tomarBanho() {
		System.out.println("O "+nome+" está tomando banho");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Miau, miau");
	}
	
	@Override
	public String toString() {
		return "Gato com nome:" + nome +", peso: "+ peso + ", raça: "+ raca +", data de nascimento: " + dataNascimento +
				" e cor de pelagem: " + corPelagem;
	}
	
}
