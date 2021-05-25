import java.util.Scanner;
import java.lang.Math;
import java.lang.Object;

/**
*@author schi8m
*@version HomeworkGame in alpha 2.4
*@since HomeworkGame in alpha 2.3
* Класс - интерфейс взаимодействия с пользователем.
*/

public class Game{

static int numbersOfUnits[] = new int[4];
static int numberOfMoves;

	public static void main (String[] args){
		System.out.println("Привет. Выбери, что тебе"+
			" нужно:\n1 - Начать игру\n2 - Выход");
		Scanner scan = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue){
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
		numbersOfUnits[0] = scan.nextInt();
		System.out.println("Какое количество магов ты хочешь?");
		numbersOfUnits[1] = scan.nextInt();
		System.out.println("Какое количество птиц ты хочешь?");
		numbersOfUnits[2] = scan.nextInt();
		System.out.println("Какое количество Икаров ты хочешь?");
		numbersOfUnits[3] = scan.nextInt();
		System.out.println("Максимальное кол-во ходов:");
		numberOfMoves = scan.nextInt();
		Engine.createHeroes(numbersOfUnits, numberOfMoves);
	}
}
