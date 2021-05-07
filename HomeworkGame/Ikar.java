public class Ikar extends Unit implements FlyingUnit{
	public void attack(int number, Unit[] units){}
	public void move(){
		// I'm can't move, just fly
		fly();
	}
	public void getDamage(double damage){}
	public void fly(){}
	public void createStats(){
		type = "flying";
		health = (int) (Math.random()*100);
		attackPower = (int) (Math.random()*100);
		speed = (int) (Math.random()*100);
	}

	public void info(){
		System.out.println(
			"Name: "+name+"\n"+
			"Power: "+attackPower+"\n"+
			"Speed: "+speed+"\n"+
			"Health: "+health+"\n"+
			"я атакую "+numberOfAttaked+" юнитов\n"+
			"Урон:"+damage+"\n"
		);
	}
}