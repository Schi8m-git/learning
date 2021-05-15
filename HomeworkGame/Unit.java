abstract public class Unit{
	public String ALIVE = "alive";
	public String DEAD = "dead";
	public String LONG_DEAD = "longdead";
	protected int RAND_VALUE = 100;
	public static int count = 0;
	protected String name;
	protected int health;
	protected int attackPower;
	protected int speed;
	protected int attackRange;
	protected double damage;
	protected String status;
	abstract void move();
	abstract void attack(int number, Unit[] units);
	abstract void createStats();
	abstract void checkStatus();
}