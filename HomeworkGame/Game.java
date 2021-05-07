import java.util.Scanner;
import java.lang.Math;
public class Game{
	public static void main (String[] args){
		System.out.println("Привет. Выбери, что тебе нужно:\n1 - Начать игру\n2- Выход");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		switch (x) {
			case (1): unitsCount = startGame();
			break;
			case (2): System.out.println("Пока.");
			break;
		}
	}
	
	private static int startGame(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Какое количество воинов ты хочешь?");
		int numberOfWarriors = scan.nextInt();
		System.out.println("Какое количество магов ты хочешь?");
		int numberOfWizards = scan.nextInt();
		System.out.println("Какое количество птиц ты хочешь?");
		int numberOfBirds = scan.nextInt();
		System.out.println("Какое количество Икаров ты хочешь?");
		int numberOfIkars = scan.nextInt();
		System.out.println("Максимальное кол-во ходов:");
		int numberOfMoves = scan.nextInt();
		createHeroes(
			numberOfWarriors, 
			numberOfWizards, 
			numberOfBirds, 
			numberOfIkars,
			numberOfMoves
		);
		return numberOfWarriors+numberOfWizards+numberOfBirds+numberOfIkars;
	}


	private static void createHeroes(
		int numberOfWarriors, 
		int numberOfWizards,
		int numberOfBirds,
		int numberOfIkars,
		int numberOfMoves
	){
		int arrayLength = numberOfWarriors+numberOfWizards+numberOfBirds+numberOfIkars;
		System.out.println("");
		Unit[] units = new Unit[arrayLength];
		for (int i = 0;i<numberOfWarriors;i++){
			units[i] = new Warrior();
			units[i].name = "Warrior"+(i+1);
		}
		for (int i = numberOfWarriors;i<numberOfWizards+numberOfWarriors;i++){
			units[i] = new Wizard();
			units[i].name = "Wizard"+(i+1);
		}
		for (int i = numberOfWarriors+numberOfWizards; i<arrayLength-numberOfIkars; i++){
			units[i] = new Bird();
			units[i].name = "Bird"+(i+1);
		}
		for (int i = numberOfWarriors+numberOfWizards+numberOfBirds; i<arrayLength; i++){
			units[i] = new Ikar();
			units[i].name = "Ikar"+(i+1);
		}
		for (int i = 0;i<units.length;i++){
			units[i].createStats();
			units[i].numberOfAttaked = (units[i].speed*arrayLength)/100;
			units[i].damage = (1-units[i].speed/100)*(units[i].attackPower);
			units[i].info();
		}
		for (int i = 0; i<numberOfMoves;i++){
			System.out.println("\n Ход №"+(i+1));
			for (int j = 0; j<units.length;j++){
				units[j].attack();
				units[j].move();
			}
		}
	}

	public void	getWarriorDamage(double damage, String name){
		System.out.println(name+" нанес "+damage+" урона");
	}
}