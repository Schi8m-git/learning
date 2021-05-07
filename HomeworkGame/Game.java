import java.util.Scanner;
import java.lang.Math;
public class Game{
	public static void main (String[] args){
		System.out.println("Привет. Выбери, что тебе нужно:\n1 - Начать игру\n2- Выход");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while ((x!=1)&(x!=2)){
			System.out.println("Ты не туда нажал");
			x = scan.nextInt();
		}
		switch (x) {
			case (1): startGame();
			break;
			case (2): System.out.println("Пока.");
			break;
		}
	}
	
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


	private static void createHeroes(
		int numberOfWarriors, 
		int numberOfWizards,
		int numberOfBirds,
		int numberOfIkars,
		int numberOfMoves
	){
		int j=0;
		int arrayLength = numberOfWarriors+numberOfWizards+numberOfBirds+numberOfIkars;
		Unit[] units = new Unit[arrayLength];
		Unit[] warr = new Unit[numberOfWarriors];
		Unit[] wizz = new Unit[numberOfWizards];
		Unit[] birds = new Unit[numberOfBirds];
		Unit[] ikars = new Unit[numberOfIkars];

		for (int i = 0; i<numberOfWarriors;i++){
			warr[i] = new Warrior();
			warr[i].name = "Warrior"+(i+1);
			units[j] = warr[i];
			j++;
		}
		for (int i = 0; i<numberOfWizards;i++){
			wizz[i] = new Wizard();
			wizz[i].name = "Wizzard"+(i+1);
			units[j] = wizz[i];
			j++;
		}
		for (int i = 0; i<numberOfBirds;i++){
			birds[i] = new Bird();
			birds[i].name = "Bird"+(i+1);
			units[j] = birds[i];
			j++;
		}
		for (int i = 0; i<numberOfIkars;i++){
			ikars[i] = new Ikar();
			ikars[i].name = "Ikar"+(i+1);
			units[j] = ikars[i];
			j++;
		}


		for (int i = 0;i<units.length;i++){
			units[i].createStats();
			units[i].numberOfAttaked = (((units[i].speed*arrayLength)/100)<1)? 1: (units[i].speed*arrayLength)/100;
			units[i].damage = (1-units[i].speed/100)*(units[i].attackPower);
			units[i].info();
		}

		for (int i = 0; i<numberOfMoves;i++){
			System.out.println("\n Ход №"+(i+1));
			for (int k = 0; k<units.length;k++){
				units[k].attack(k,units);
				units[k].move();
				units[k].info();
			}
		}
	}
}