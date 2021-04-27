import java.util.Scanner;

public class Tg{

	public static void main(String[] args){
		double accuracy;

		int arg = 5;

		System.out.println("Введите необходимую точность:");
		Scanner scan = new Scanner(System.in);
		accuracy = scan.nextDouble();

		Sin sin = new Sin();
		double sinValue = sin.getSinValue(accuracy, arg);

		Cos cos = new Cos();
		double cosValue = cos.getCosValue(accuracy, arg);

		double tg = sinValue/cosValue;
		
		System.out.println(tg);
	}
}