package game;

import Players.User;
import Players.Persons;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public final static Scanner answer = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Players> newPlayers = new ArrayList<>();

		System.out.println("Choose your vehicule:");
		System.out.println("type 1 for a Mercedes");
		System.out.println("type 2 for a BMW");
		System.out.println("type 3 for a Twingo");
		System.out.println("***************************************");
		
		while( answer.hasNextInt() == false ) {
			System.out.println("Please enter a number between 1 and 3");
			answer.next();
		}
		
		
		int cat = answer.nextInt();
		switch ( cat ) {
			case 1:
			System.out.println("Vous avez choisi la catégorie Mercedes");			
			newPlayer.add(mercedes.createMercedes()); 
				break;
			case 2:
			System.out.println("Vous avez choisi la catégorie BMW");
			newPlayer.add(bmw.createBmw());
				break;
			case 3:
			System.out.println("Vous avez choisi la catégorie Twingo");
			newPlayer.add(twingo.createTwingo());
				break;
			default:
			System.out.println("??????????????");
				break;
		}
	}
}






