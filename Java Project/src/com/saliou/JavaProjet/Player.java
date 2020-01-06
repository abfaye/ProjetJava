package com.saliou.JavaProjet;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Player {
	
	private ArrayList<Chateaux> chateaus;
	private Color couleur;
	private Input input;

	public Player(ArrayList<Chateaux> chateaus, Color couleur, Input input) {
		super();
		this.chateaus = new ArrayList<Chateaux>();
		this.setCouleur(couleur);
		this.setChateaus(chateaus);
		this.input = input;
	}

	public ArrayList<Chateaux> getChateaus() {
		return chateaus;
	}

	public void setChateaus(ArrayList<Chateaux> chateaus) {
		this.chateaus = chateaus;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}
	
	

}
