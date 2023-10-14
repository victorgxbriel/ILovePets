package usuario;

import java.util.ArrayList;

public class PrestadorServicos extends Usuario{
	private ArrayList<String> especialidades;
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public PrestadorServicos(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade);
		this.salario = salario;
		especialidades = new ArrayList<String>();
	}
	
	public void cadastrarEspecialidade(String esp) {
		especialidades.add(esp);
	}
	
	public void listarEspecialidades() {
		System.out.println("Essas são as especialidades de "+nome+" :");
		for(String e : especialidades) {
			System.out.println(e);
		}
	}
	
	@Override
	public String toString() {
		String esp = "";
		for(String e : especialidades) {
			esp += e + " ";
		}
		return (especialidades.isEmpty()) ? 
				"Prestador de serviço com nome: "+nome+", idade: "+idade+", cpf: "+cpf+" e salario: "+salario
				: "Prestador de serviço com nome: "+nome+", idade: "+idade+", cpf:"+cpf+", salario: "
				+salario+" e especialidades: ";
	}
}
