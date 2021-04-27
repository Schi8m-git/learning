import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Привет, напиши что тебе нужно");
		System.out.println("1 - вычисление синуса;");
		System.out.println("2 - вычисление косинуса");
		System.out.println("3 - вычисление тангенса");

		int x = scan.nextInt();

		switch(x){
			case 1:
			Sin.countSin();
			break;
			case 2:
			Cos.countCos();
			break;
			case 3:
			Tg.countTg();
			break;
		} 
	}
}