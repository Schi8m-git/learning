public class Wizard extends MagicianUnit{
	public void move(){
		System.out.println("Я бегу со скоростью "+speed);
	}
	public void attack(){
		System.out.println("Я бью с силой "+power);
	}
	public void spellCast(){
		System.out.println("Я колдую и уменя "+mana+" манны");
	}
}