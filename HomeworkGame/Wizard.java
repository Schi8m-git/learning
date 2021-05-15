public class Wizard extends MagicianUnit{

	/**
	*Метод, который атакует других юнитов.
	*@param number номер текущего юнита в массиве Unit[].
	*@param units массив со всеми персонажами.
	*/
	public void attack(int number, Unit[] units){
		if (units[number].health>0){
			int currentNumber = number+1;	
			for(int i = 0; i<units[number].attackRange;i++){
				if (currentNumber>=units.length){
					currentNumber = 0;
				}
				while (
					(units[currentNumber].status==LONG_DEAD)|
					(currentNumber==number)|
					(units[currentNumber].status==DEAD)
					){
					currentNumber++;
					if ((currentNumber)>=units.length){
					currentNumber = 0;
					}
				}
				if (units[currentNumber] instanceof FlyingUnit){
					units[currentNumber].health -= (units[number].damage/2);
					units[currentNumber].checkStatus();
					if(units[currentNumber].status==ALIVE){
						System.out.println(units[number].name+
							" нанес "+(units[number].damage)+
							" урона "+units[currentNumber].name+
							", теперь у него "+
						units[currentNumber].health+" хп. Наземный -->> Летающий");
					} else if(units[currentNumber].status==DEAD){
						System.out.println(units[number].name+
							" нанес "+units[number].damage+
							" урона "+units[currentNumber].name+
							" и убил его.");
					}
				} else{
					units[currentNumber].health -= units[number].damage;
					units[currentNumber].checkStatus();
					if(units[currentNumber].status==ALIVE){
						System.out.println(units[number].name+
							" нанес "+units[number].damage+
							" урона "+units[currentNumber].name+
							" , теперь у него "+
						units[currentNumber].health+" хп.");
					} else if(units[currentNumber].status==DEAD){
						System.out.println(units[number].name+
							" нанес "+units[number].damage+
							" урона "+units[currentNumber].name+
							" и убил его.");
					}
				}
					
					currentNumber++;
					boolean statement;
					statement = Game.scanAlives(units);
					if (statement){
						break;
					}
			}
		}
	}
	

	public void move(){}


	/**
	* Генерирует рандомные хар-ки.
	*/
	public void createStats(){
		health = 1 + (int) (Math.random()*RAND_VALUE);
		attackPower = 1 + (int) (Math.random()*RAND_VALUE);
		speed = 1 + (int) (Math.random()*RAND_VALUE);
		manna = 1 + (int) (Math.random()*RAND_VALUE);
		status = ALIVE;

	}


	/**
	*Меняет статут юнита после получения урона.
	*/
	public void checkStatus(){
		if (health == 0){
			status = LONG_DEAD;
		} else if (health<0){
			health = 0;
			damage = 0;
			status = DEAD;
		}else{
			status = ALIVE;
		}
	}



	/**
	* Выводит инфу о юните.
	*/
	@Override
	public String toString(){
		if (health>0){
		return
			"Имя: "+name+
			", Хп: "+health+
			", Урон: "+damage+
			", Манна: "+manna+
			", Атакует: "+attackRange+" персонажей."
		;} else {
			return name+" мертв.";
		}
	}
}