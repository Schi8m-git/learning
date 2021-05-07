public class Wizard extends MagicianUnit{
	public void attack(){}
	public void move(){}
	public void spellCast(){}
	public void createStats(){
		health = (int) (Math.random()*100);
		speed = (int) (Math.random()*100);
		manna = (int) (Math.random()*100);
		attackPower = (int) (Math.random()*100) + manna;
	}

	public void info(){
		System.out.println(
			"Name: "+name+"\n"+
			"Power: "+(attackPower-manna)+"\n"+
			"Speed: "+speed+"\n"+
			"Health: "+health+"\n"+
			"Manna: "+manna+"\n"+
			"я атакую "+numberOfAttaked+" юнитов\n"+
			"Урон:"+damage+"\n"
		);
	}
}