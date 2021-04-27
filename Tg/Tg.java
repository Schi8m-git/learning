import java.util.Scanner;

public class Tg{

	public static void main(String[] args){
		double accuracy;

		int arg = 5;

		System.out.println("Введите необходимую точность:");
		Scanner scan = new Scanner(System.in);
		accuracy = scan.nextDouble();

		double sinValue = Sin.getSinValue(accuracy, arg);
		double cosValue = Cos.getCosValue(accuracy, arg);

		double tg = sinValue/cosValue;
		
		System.out.println(tg);
	}
}