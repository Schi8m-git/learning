public class Warrior extends Unit{
	public void attack(){
		Game game = new Game();
		game.getWarriorDamage(damage, name);
	}
	public void move(){}
	public void createStats(){
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