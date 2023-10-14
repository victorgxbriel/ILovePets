package main;

import usuario.*;

import java.time.LocalDate;

import animal.*;

public class ILovePets {
	public static void main(String[] args) {
		
		Usuario tutor1 = new Tutor("Victor", "123", 23);
		Animal animal1 = new Cao("Apolo",LocalDate.of(2021, 4, 12), 20.4, "Rotweiler");
		((Tutor)tutor1).cadastrarAnimal(animal1);
		Animal animal12 = new Gato("Belinha", LocalDate.of(2022, 1, 30), 10.2, "Siamês", "Chocolat Point");
		((Tutor)tutor1).cadastrarAnimal(animal12);
		
		Usuario tutor2 = new Tutor("André", "654", 21);
		Animal animal21 = new Coelho("Bebé", LocalDate.of(2020, 2, 10), 15.5 ,"Mini Rex", "Orelhas eretas");
		((Tutor)tutor2).cadastrarAnimal(animal21);
		Animal animal22 = new Rato("Jerry", LocalDate.of(1940, 2, 10), 8.0, "Mus Musculus");
		((Tutor)tutor2).cadastrarAnimal(animal22);
		
		Usuario vendedor1 = new Vendedor("Seu zé", "023", 32, 1550.10);
		
		Usuario servicos1 = new PrestadorServicos("Maria", "240", 25, 2500.3);
		((PrestadorServicos)servicos1).cadastrarEspecialidade("Tosar");
		((PrestadorServicos)servicos1).cadastrarEspecialidade("Acunputura");
		
		Usuario servicos2 = new PrestadorServicos("Liandra", "444", 27, 5120.9);
		((PrestadorServicos)servicos2).cadastrarEspecialidade("Adestrar");
		((PrestadorServicos)servicos2).cadastrarEspecialidade("Passear");
		
		((Tutor)tutor1).listarAnimais();
		((PrestadorServicos)servicos2).listarEspecialidades();
		System.out.println(((Tutor)tutor2).toString());
	}
}
