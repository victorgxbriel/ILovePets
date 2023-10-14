package usuario;
import java.util.ArrayList;

import animal.Animal;

public class Tutor extends Usuario{
	private ArrayList<Animal> animais;
	
	public Tutor(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
		animais = new ArrayList<Animal>();
	}
	
	public void cadastrarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public void listarAnimais() {
		System.out.println("Esses são os animais de "+nome+" :");
		for(Animal a : animais) {
			System.out.println(a.toString());
		}
	}
	
	@Override
	public String toString() {
		String descricaoAnimais = "";
		for(Animal a : animais) {
			descricaoAnimais += a.toString() + "\n";
		}
		return (animais.isEmpty()) ? 
				"Tutor com nome: "+nome+", idade: "+idade+" e cpf: "+cpf 
				: "Tutor com nome: "+nome+", idade: "+idade+
				"e animais: "+descricaoAnimais;
	}
}
