public class Wizard extends MagicianUnit implements HickingUnit{


	/**
	* Генерирует рандомные хар-ки.
	*/
	public void createStats(){
		health = 1 + (int) (Math.random()*MAX_VALUE);
		attackPower = 1 + (int) (Math.random()*MAX_VALUE);
		speed = 1 + (int) (Math.random()*MAX_VALUE);
		manna = 1 + (int) (Math.random()*MAX_VALUE);
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