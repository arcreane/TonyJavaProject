package Players;

import java.util.Scanner;

public class Players {

	String Name;
	String Surname;
	String Id;
	String Speed;
	
	//12
	public Players() {
		
	}
	
	// 10
	Players(String name, String surname, String id, String speed) {
		Name = name;
		Surname = surname;
		Id = id;
		Speed = speed;
	}

	//13
	public void initPerson() {
		// TODO Auto-generated method stub
		
		Scanner answer = new Scanner(System.in);

		  System.out.println("Veuillez renseigner votre prénom : ");
		  Surname = answer.nextLine();
		  System.out.println("Veuillez renseigner votre nom : ");
		  Name = answer.nextLine();
	}
}
	