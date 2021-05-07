public class Warrior extends Unit{
	public void attack(int number,Unit[] units){
		int currentNumber = number;
		int j=1;
			for(int i = 1; i<=numberOfAttaked;i++){
				if ((i+number)>=units.length){
					number = 0;
					j = 0;
				}
				units[j+number].getDamage(damage);
				if(units[number+j].health>0){
					System.out.println(units[currentNumber].name+" нанес "+units[currentNumber].damage+" урона "+units[j+number].name+" , теперь у него "+units[j+number].health+" хп.");
				} else {
					System.out.println(units[number+j].name+" был убит.");
				}
				j++;
			}
	}
	public void move(){}
	public void createStats(){
		type = "hiking";
		health = (int) (Math.random()*100);
		attackPower = (int) (Math.random()*100);
		speed = (int) (Math.random()*100);
	}
	public void getDamage(double damage){
			health -= damage;
			if (health<=0){
				health = 0;
				damage = 0;
			}
		}

	public void info(){
		if (health>0){
		System.out.println(
			"Name: "+name+"\n"+
			"Health: "+health+"\n"+
			"Урон:"+damage+"\n"+
			"Атакует: "+numberOfAttaked+"\n"
		);} else {
			System.out.println(name+" мертв.");
		}
	}
}