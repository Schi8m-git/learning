public class Ikar extends Unit implements FlyingUnit{
	public void attack(){
		System.out.println("Ikar's attack and have a "+health+" hp");
	}
	public void move(){
		System.out.println("Ikar's move");
	}
	public void fly(){
		System.out.println("Ikar is flying");
	}
}