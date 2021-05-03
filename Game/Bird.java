public class Bird extends Unit implements FlyingUnit{
	public void move(){
		System.out.println("Я бегу со скоростью "+speed);
	}
	public void attack(){
		System.out.println("Я бью с силой "+power);
	}
	public void fly(){
		System.out.println("Я лечу и у меня "+health+" хп");
	}
}