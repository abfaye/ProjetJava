package com.soldats_Game;
public abstract class Soldat {
  private int coutDeProduction ;
  private int tempsDeProduction;
  private int vitesseCaseParTours;
  private int pointsDeVie;
  private int degats;
  
  public Soldat(int cout, int temps, int vitess, int point, int degats) {
	  this.coutDeProduction=cout;
	  this.tempsDeProduction=temps;
	  this.vitesseCaseParTours=vitess;
	  this.pointsDeVie=point;
	  this.degats=degats;
  }
  
  
}