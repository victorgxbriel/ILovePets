package animal;

import java.time.LocalDate;

public abstract class Animal {
	protected String nome;
	protected LocalDate dataNascimento;
	protected double peso;
	protected String raca;
	
	public Animal(String nome, LocalDate data, double peso, String raca) {
		this.nome = nome;
		this.dataNascimento = data;
		this.peso = peso;
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public String toString() {
		return "Classe mãe Animal contendo os atributos base, nome: " + nome +", peso: "+ peso +", raça: "+ raca +" e date de nascimento: "+ dataNascimento +".";
	}
	
	public abstract void emitirSom();
	
}
