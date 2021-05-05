import java.util.Scanner;
import java.lang.Math;
public class Game{
	public static void main (String[] args){
		System.out.println("Привет. Выбери, что тебе нужно:\n1 - Начать игру\n2- Выход");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
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
			numberOfIkars
		);


	}
	private static void createHeroes(
		int numberOfWarriors, 
		int numberOfWizards,
		int numberOfBirds,
		int numberOfIkars
	){
		int arrayLength = numberOfWarriors+numberOfWizards+numberOfBirds+numberOfIkars;
		System.out.println(arrayLength);
		Unit[] units = new Unit[arrayLength];
		for (int i = 0;i<numberOfWarriors;i++){
			units[i] = new Warrior();
			units[i].health = (int) (Math.random()*100);
			units[i].name = "Warrior"+i;
		}
		for (int i = numberOfWarriors;i<numberOfWizards+numberOfWarriors;i++){
			units[i] = new Wizard();
			units[i].health = (int) (Math.random()*100);
			units[i].name = "Wizard"+i;
		}
		for (int i = numberOfWarriors+numberOfWizards; i<arrayLength-numberOfIkars; i++){
			units[i] = new Bird();
			units[i].health = (int) (Math.random()*100);
			units[i].name = "Bird"+i;
		}
		for (int i = numberOfWarriors+numberOfWizards+numberOfBirds; i<arrayLength; i++){
			units[i] = new Ikar();
			units[i].health = (int) (Math.random()*100);
			units[i].name = "Ikar"+i;
		}
		for (int i = 0;i<units.length;i++){
			units[i].attack();
		}
	}
}