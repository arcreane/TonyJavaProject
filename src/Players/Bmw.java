package Players;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bmw extends Players {

	static ArrayList<Vehicule> m_arrayVehicules;

	public Bmw(String name, String surname, String id, String speed) {
		super(name, surname, id, speed);
		init();
	}

	// 12
	public Bmw() {
		init();
	}

	private void init() {
		m_arrayVehicules = new ArrayList<>();
	}

	public static Bmw createBmw() {
		// TODO Auto-generated method stub
		Bmw myBmw = new Bmw();

		myBmw.initPlayers();

		myBmw.createVehiculeList();

		return myBmw;
	}

}