abstract public class Unit{
	public static final String ALIVE = "alive";
	public static final String DEAD = "dead";
	public static final String LONG_DEAD = "longdead";
	protected static final int MAX_VALUE = 100;
	public static int count = 0;
	protected String name;
	protected int health;
	protected int attackPower;
	protected int speed;
	protected int attackRange;
	protected double damage;
	protected String status;
	abstract void attack();
	abstract void createStats();
	abstract void checkStatus();
}