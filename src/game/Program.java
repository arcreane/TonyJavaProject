package game;

import Persons.User;
import Persons.Persons;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public final static Scanner answer = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persons> newPersons = new ArrayList<>();

		System.out.println("Choose your vehicule:");
		System.out.println("type 1 for a Customer");
		System.out.println("type 2 for a Admin");
		System.out.println("type 3 for a Mechanic");
		System.out.println("***************************************");
		
		while( answer.hasNextInt() == false ) {
			System.out.println("Please enter a number between 1 and 3");
			answer.next();
		}
		
		
		int cat = answer.nextInt();
		switch ( cat ) {
			case 1:
			System.out.println("Vous avez choisi la catégorie Customer");			
			newPersons.add(Customer.createCustomer()); 
				break;
			case 2:
			System.out.println("Vous avez choisi la catégorie Admin");
			newPersons.add(Admin.createAdmin());
				break;
			case 3:
			System.out.println("Vous avez choisi la catégorie Mechanic");
			newPersons.add(Mechanic.createMechanic());
				break;
			default:
			System.out.println("??????????????");
				break;
		}
	}
}






