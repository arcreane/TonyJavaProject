package Persons;

import java.util.Scanner;

public class Persons {

	String Name;
	String Surname;
	String Id;
	
	//12
	public Persons() {
		
	}
	
	// 10
	Persons(String name, String surname, String id) {
		Name = name;
		Surname = surname;
		Id = id;
	}

	//13
	public void initPerson() {
		// TODO Auto-generated method stub
		
		Scanner answer = new Scanner(System.in);

		  System.out.println("Veuillez renseigner votre prénom : ");
		  Surname = answer.nextLine();
		  System.out.println("Veuillez renseigner votre nom : ");
		  Name = answer.nextLine();
		  // Récupérer un nombre/plusieurs random et les concaténés avec le name et surname pour créer l'id
	}
}
	