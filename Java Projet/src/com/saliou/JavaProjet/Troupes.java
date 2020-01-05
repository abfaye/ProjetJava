package com.saliou.JavaProjet;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

//Saliou Diallo
public class Troupes extends Sprite{

	private int productionCost;
	private int productionTime;
	private int speed;
	private int health;
	private int damage;
	
	private double minX;
	private double maxX;
	private double minY;
	private double maxY;

	private Input input;
	private double fireFrequency;
	private double lastFire = 0;
	
	public Troupes(Pane layer,Image image,double x, double y,int productionCost, int productionTime, int speed, int health, int damage,Input input) {
		super(layer, image, x, y, health);
		this.productionCost = productionCost;
		this.productionTime = productionTime;
		this.speed = speed;
		this.health = health;
		this.damage = damage;
		setDx(--speed);
		setDy(--speed);
		maxY = Settings.SCENE_HEIGHT - image.getHeight();
		setFireFrequencyMedium();
		
		init();
	}

	public int getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(int productionCost) {
		this.productionCost = productionCost;
	}

	public int getProductionTime() {
		return productionTime;
	}

	public void setProductionTime(int productionTime) {
		this.productionTime = productionTime;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public boolean isAlive() {
		return getHealth() > 0;
	}
	private void init() {
		// calculate movement bounds of the player ship
		// allow half of the player to be outside of the screen
		minX = 0 - getWidth() / 2.0;
		maxX = Settings.SCENE_WIDTH - getWidth() / 2.0;
		minY = 0 - getHeight() / 2.0;
		maxY = Settings.SCENE_HEIGHT - getHeight();
	}

	public void processInput() {
		// vertical direction
		if (input.isMoveUp()) {
			dy = -speed;
		} else if (input.isMoveDown()) {
			dy = speed;
		} else {
			dy = 0d;
		}

		// horizontal direction
		if (input.isMoveLeft()) {
			dx = -speed;
		} else if (input.isMoveRight()) {
			dx = speed;
		} else {
			dx = 0d;
		}

	}

	@Override
	public void move(double x, double y) {

		if(x < this.x) {
			this.x += this.dx;
		}else if(x > this.x) {
			this.x -= this.dx;
		}
		if(y < this.y) {
			this.y += this.dy;
		}else if(y > this.x) {
			this.y -= this.dy;
		}
	}

	
	@Override
	public void checkRemovability() {
	}

	public boolean canFire(long now) {
		return (now - lastFire >= fireFrequency);
	}

	public void fire(long now) {
		lastFire = now;
	}

	public void setFireFrequencyLow() {
		this.fireFrequency = Settings.FIRE_FREQUENCY_LOW;
	}
	
	public void setFireFrequencyMedium() {
		this.fireFrequency = Settings.FIRE_FREQUENCY_MEDIUM;
	}
	
	public void setFireFrequencyHigh() {
		this.fireFrequency = Settings.FIRE_FREQUENCY_HIGH;
	}

}
