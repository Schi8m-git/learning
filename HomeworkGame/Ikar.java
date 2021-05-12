public class Ikar extends Unit implements FlyingUnit{
	public void attack(int number, Unit[] units){
		if (units[number].health>0){
			String status="";
			int currentNumber = number+1;
			for(int i = 1; i<=units[number].attackRange;i++){
				if (currentNumber>=units.length){
					currentNumber = 0;
				}
				while ((status=="longDead")|(currentNumber==number)){
					currentNumber++;
					if ((currentNumber)>=units.length){
					currentNumber = 0;
					}
				}
				status = units[currentNumber].getDamage(units[number].damage, units[number].type);
				
					if(status=="alive"){
						System.out.println(units[number].name+" нанес "+units[number].damage+
						" урона "+units[currentNumber].name+" , теперь у него "+units[currentNumber].health+" хп.");
					} else if(status=="dead"){
						System.out.println(units[number].name+" нанес "+units[number].damage+
						" урона "+units[currentNumber].name+" и убил его.");
					}
					currentNumber++;
			}
		}
	}


	public void move(){}


	public void fly(){}


	public void createStats(){
		type = "flying";
		health = 1 + (int) (Math.random()*100);
		attackPower = 1 + (int) (Math.random()*100);
		speed = 1 + (int) (Math.random()*100);
	}


	public String getDamage(double damage, String type){
		if (health == 0){
			return "longDead";
		} else{
			if (type=="hicking"){
				health -= (damage/2);
			}else{
			health -= damage;
			}
			if (health<=0){
				health = 0;
				this.damage = 0;
				return "dead";
			}	
		}
		return "alive";
	}


	public void info(){
		if (health>0){
		System.out.println(
			"Имя: "+name+
			", Хп: "+health+
			", Урон:"+damage+
			", Атакует: "+attackRange+" персонажей."
		);} else {
			System.out.println(name+" мертв.");
		}
	}
}