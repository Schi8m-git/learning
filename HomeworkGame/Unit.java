abstract public class Unit{
	protected String name;
	protected int health;
	protected int attackPower;
	protected int speed;
	protected int numberOfAttaked;
	protected double damage;
	abstract void move();
	abstract void attack();
	abstract void createStats();
	abstract void info();
}