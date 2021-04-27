import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Sin sin = new Sin();
		Cos cos = new Cos();
		Tg tg = new Tg();

		System.out.println("Привет, напиши что тебе нужно");
		System.out.println("1 - вычисление синуса;");
		System.out.println("2 - вычисление косинуса");
		System.out.println("3 - вычисление тангенса");

		int x = scan.nextInt();

		switch(x){
			case 1:
			sin.countSin();
			break;
			case 2:
			cos.countCos();
			break;
			case 3:
			tg.countTg();
			break;
		} 
	}
}