package Players;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercedes extends Players {

	static ArrayList<Vehicule> m_arrayVehicules;

	public Mercedes(String name, String surname, String id, String speed) {
		super(name, surname, id, speed);
		init();
	}

	// 12
	public Mercedes() {
		init();
	}

	private void init() {
		m_arrayVehicules = new ArrayList<>();
	}

	public static Mercedes createMercedes() {
		// TODO Auto-generated method stub
		Mercedes myMercedes = new Mercedes();

		myMercedes.initPlayers();

		myMercedes.createVehiculeList();

		return myMercedes;
	}

}
