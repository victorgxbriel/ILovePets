package usuario;

public class Usuario {
	protected String nome;
	protected String cpf;
	protected int idade;
	
	public Usuario(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	@Override
	public String toString() {
		return "Usuario com nome: "+nome+", cpf: "+cpf+", idade: "+idade;
	}
}
