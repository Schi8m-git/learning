import java.util.Scanner;
import java.lang.Math;
import java.lang.Object;

/**
*@author schi8m
*@version HomeworkGame in alpha 2.1
*@since HomeworkGame in alpha 1.1
* Главный класс программы.
*/
public class Game{
	public static void main (String[] args){
		System.out.println("Привет. Выбери, что тебе нужно:\n1 - Начать игру\n2 - Выход");
		Scanner scan = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue){
			int clickCounter = 0;
			int x = scan.nextInt();
			switch (x) {
				case (1): startGame();
				case (2): isContinue = false;
				break;
				default: System.out.println("Не туда нажал");
			}
		}
	}
	
	/**
	*Принимает какое кол-во юнитов какого типо нужно создать.
	*/
	private static void startGame(){
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
	}

	/**
	* Создаёт юнитов, генерирует им имя и создаёт отдельные 
	* массивы как длякаждого класса юнитов, так и для всех сразу.
	*/
	private static void createHeroes(
		int numberOfWarriors, 
		int numberOfWizards,
		int numberOfBirds,
		int numberOfIkars,
		int numberOfMoves
	){
		int arrayLength = numberOfWarriors+numberOfWizards+numberOfBirds+numberOfIkars;
		Unit[] units = new Unit[arrayLength];
		Unit[] warr = new Unit[numberOfWarriors];
		Unit[] wizz = new Unit[numberOfWizards];
		Unit[] birds = new Unit[numberOfBirds];
		Unit[] ikars = new Unit[numberOfIkars];

		for (int i = 0; i<numberOfWarriors;i++){
			warr[i] = new Warrior();
			warr[i].name = "Warrior"+(i+1);
			units[Unit.count] = warr[i];
			Unit.count++;
		}
		for (int i = 0; i<numberOfWizards;i++){
			wizz[i] = new Wizard();
			wizz[i].name = "Wizzard"+(i+1);
			units[Unit.count] = wizz[i];
			Unit.count++;
		}
		for (int i = 0; i<numberOfBirds;i++){
			birds[i] = new Bird();
			birds[i].name = "Bird"+(i+1);
			units[Unit.count] = birds[i];
			Unit.count++;
		}
		for (int i = 0; i<numberOfIkars;i++){
			ikars[i] = new Ikar();
			ikars[i].name = "Ikar"+(i+1);
			units[Unit.count] = ikars[i];
			Unit.count++;
		}


		for (int i = 0;i<units.length;i++){
			units[i].createStats();
			units[i].attackRange = (((units[i].speed*arrayLength)/100)<1)? 1: (units[i].speed*arrayLength)/100;
			units[i].damage = (1-units[i].speed/100)*(units[i].attackPower);
			System.out.println(units[i].toString());
		}
		gamesMove(units, numberOfMoves);
	}

	/**
	* Реализует ходы.
	*/
	public static void gamesMove(Unit[] units, int numberOfMoves){
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i<=numberOfMoves;i++){
			System.out.println("\n Ход №"+i);
			for (int k = 0; k<units.length;k++){
				units[k].attack(k,units);
				units[k].move();
			}
			System.out.println("\n Итоги хода:\n "+
				"Внимание! Если в живых остался только один персонаж, лучше закончить игру).");
			for (int g=0;g<units.length;g++){
				System.out.println(units[g].toString());
			}
			System.out.println("1 - следующий ход\n2 - выход");
			int z = scan.nextInt();
			if (z==2){
				break;
			}
		}	
	}


	public static boolean scanAlives(Unit[] units){
		int deadCounter = 0;
		int aliveCounter = 0;
		String winnerName = "";
		for (int i = 0; i<units.length; i++){
			if ((units[i].status=="dead")|(units[i].status=="longdead")){
				deadCounter += 1;
			} else {
				aliveCounter += 1;
			}
		}

		if (aliveCounter<=1){
			for (int j = 0; j<units.length; j++){
				if (units[j].status=="alive"){
					winnerName = units[j].name;
				}
			}
			System.out.println("Последний выживший "+ winnerName);
			return true;
		} else {
			return false;
		}
	}	
}
