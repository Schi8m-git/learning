import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleInput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int[] array = new int[] {1, 2, 3, 4, 5};

		int a=0;

		boolean incorrectInput = true;
		while(incorrectInput){
			try{
				a = scan.nextInt();
				System.out.println(array[a]);
				incorrectInput = false;
			}
			catch(InputMismatchException e){
				System.err.println("Это не выглядит как число");
				scan.next();
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Массив короче, чем ты думаешь");
			}
		}
	}
}