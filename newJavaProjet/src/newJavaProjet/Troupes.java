package newJavaProjet;
//Saliou Diallo
public class Troupes {

	private int productionCost;
	private int productionTime;
	private int speed;
	private int health;
	private int damage;

	public Troupes(int productionCost, int productionTime, int speed, int health, int damage) {
		super();
		this.productionCost = productionCost;
		this.productionTime = productionTime;
		this.speed = speed;
		this.health = health;
		this.damage = damage;
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

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
	

}
