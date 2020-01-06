package com.saliou.JavaProjet;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Chateaux extends Sprite{
	
	private double tresor;
	private int niveau;
	private ArrayList<Troupes> tableauTroupes;
	private Production unitProd;
	private Order order;
	private Porte porte;
	
	private boolean me;

	public Chateaux(Pane layer,Image image,double x, double y, int health, double tresor, int niveau, Production unitProd) {
		super(layer, image, x, y, health);
		
		this.tresor = tresor;
		this.niveau = niveau;
		this.unitProd = unitProd;
		this.tableauTroupes = new ArrayList<Troupes>();
	}
	
	public boolean isMe() {
		return me;
	}
	public int productionCosts () {
		return 1000*niveau;
	}
	
	public int productionTimes() {
		return 100+50+niveau;
	}
	
	public double revenuChateau(Chateaux chateaux) {
		
		return (niveau*10)/chateaux.productionTimes();
		
	}

	@Override
	public void checkRemovability() {
		// TODO Auto-generated method stub
		
	}

}
