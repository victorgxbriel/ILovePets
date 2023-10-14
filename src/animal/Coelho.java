package animal;

import java.time.LocalDate;

public class Coelho extends Animal{
	private String tipoOrelha;
	
	public Coelho(String nome, LocalDate data, double peso, String raca, String tipo) {
		super(nome, data, peso, raca);
		this.tipoOrelha = tipo;
	}
	
	public String getTipoOrelha() {
		return tipoOrelha;
	}
	
	public void setTipoOrelha(String tipoOrelha) {
		this.tipoOrelha = tipoOrelha;
	}
	
	public void cavarToca() {
		System.out.println("O "+nome+" está cavando uma toca.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Rrrrrrr");
	}

	@Override
	public String toString() {
		return "Coelho com nome=" + nome + ", dataNascimento=" + dataNascimento + ", peso=" + peso + ", raca=" + raca
				+ "]";
	}
	
}
