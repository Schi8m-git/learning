import java.util.Scanner;
import java.util.InputMismatchException;

public class Test{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int a=0;

		while(true){
			try{
				a = scan.nextInt();
				break;
			}
			catch(InputMismatchException e){
				System.err.println("Это не выглядит как число"+ a);
			}

		}

		System.out.println("Вы ввели "+a);

	}
}