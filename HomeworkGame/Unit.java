abstract public class Unit{
	protected String name;
	protected int health;
	protected int attackPower;
	protected int speed;
	protected int numberOfAttaked;
	protected double damage;
	protected String type;
	abstract void move();
	abstract void attack(int number, Unit[] units);
	abstract void createStats();
	abstract void info();
	abstract void getDamage(double damage, String type);
}