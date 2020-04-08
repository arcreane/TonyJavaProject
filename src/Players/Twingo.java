package Players;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Twingo extends Players {

	static ArrayList<Vehicule> m_arrayVehicules;

	public Twingo(String name, String surname, String id, String speed) {
		super(name, surname, id, speed);
		init();
	}

	// 12
	public Twingo() {
		init();
	}

	private void init() {
		m_arrayVehicules = new ArrayList<>();
	}

	public static Twingo createTwingo() {
		// TODO Auto-generated method stub
		Twingo myTwingo = new Twingo();

		myTwingo.initPlayers();

		myTwingo.createVehiculeList();

		return myTwingo;
	}

}