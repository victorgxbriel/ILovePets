package usuario;

public class Vendedor extends Usuario{
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Vendedor(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade);
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Vendedor com nome: "+nome+", cpf: "+cpf+", idade: "+idade+" e salario: "+salario;
	}
}
