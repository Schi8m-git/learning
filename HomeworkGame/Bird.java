public class Bird extends Unit implements FlyingUnit{
	public void attack(int number,Unit[] units){
		int currentNumber = number;
		int j=1;
			for(int i = 1; i<=numberOfAttaked;i++){
				if ((i+number)>=units.length){
					number = 0;
					j = 0;
				}
				units[j+number].getDamage(damage,type);
				if(units[number+j].health>0){
					System.out.println(units[currentNumber].name+" нанес урон "+units[j+number].name+" , теперь у него "+units[j+number].health+" хп.");
				} else {
					System.out.println(units[currentNumber].name+" нанес "+units[currentNumber].damage+" урона "+units[j+number].name+" и убил его.");
				}
				j++;
			}
	}
	public void fly(){}
	public void move(){}
	public void createStats(){
		type = "flying";
		health = (int) (Math.random()*100);
		attackPower = (int) (Math.random()*100);
		speed = (int) (Math.random()*100);
	}
	public void getDamage(double damage, String type){
		if (type=="flying"){
		this.health -= damage;	
	} else{
		this.health -= damage/2;
	}

		
		if (health<=0){
			this.health = 0;
			this.damage = 0;
		}	
	}

	public void info(){
		if (health>0){
		System.out.println(
			"Имя: "+name+"\n"+
			"Хп: "+health+"\n"+
			"Урон:"+damage+"\n"+
			"Атакует: "+numberOfAttaked+" персонажей."+"\n"
		);} else {
			System.out.println(name+" мертв.\n");
		}
	}
}