public class Bird extends Unit implements FlyingUnit{
	public void attack(){
		System.out.println("Bird's attack and have a "+health+" hp");
	}
	public void move(){
		System.out.println("Bird's move");
	}
	public void fly(){
		System.out.println("Bird is flying");
	}
}