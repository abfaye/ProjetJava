package com.saliou.JavaProjet;

public class Production {
	
	//private Troupes typeTroupe;
	//private int nbtours;
	private boolean amelior;
	private int leftime;
	private String type;
	public Production(boolean amelior, int leftime, String type) {
		super();
		this.amelior = amelior;
		this.leftime = leftime;
		this.type = type;
	}
	public boolean isAmelior() {
		return amelior;
	}
	public void setAmelior(boolean amelior) {
		this.amelior = amelior;
	}
	public int getLeftime() {
		return leftime;
	}
	public void setLeftime(int leftime) {
		this.leftime = leftime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
