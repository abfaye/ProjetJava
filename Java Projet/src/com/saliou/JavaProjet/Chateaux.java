package com.saliou.JavaProjet;

import java.util.ArrayList;

public class Chateaux {
//Saliou
	private Player player;
	private double tresor;
	private int niveau;
	private ArrayList<Troupes> tableauTroupes = new ArrayList<Troupes>();
	private Production unitProd;
	private Order order;
	private Porte porte;

	public Chateaux(Player player, double tresor, int niveau, ArrayList<Troupes> tableauTroupes, Production unitProd,
			Order order, Porte porte) {
		super();
		this.player = player;
		this.tresor = tresor;
		this.niveau = niveau;
		this.tableauTroupes = tableauTroupes;
		this.unitProd = unitProd;
		this.order = order;
		this.porte = porte;
	}
	
	public int productionCosts () {
		return 1000*niveau;
	}
	
	public int productionTimes() {
		return 100+50+niveau;
	}
	
	public double revenuChateau(Chateaux i) {
		
		return (niveau*10)/i.productionTimes();
		
	}

}
