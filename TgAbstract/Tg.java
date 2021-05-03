import java.util.Scanner;

public class Tg{

	public static void main(String[] args){
		Sin sin = new Sin();
		Cos cos = new Cos();


		double accuracy;

		int arg = 5;

		System.out.println("Введите необходимую точность:");
		Scanner scan = new Scanner(System.in);
		accuracy = scan.nextDouble();

		double sinValue = sin.getValue(accuracy, arg);
		double cosValue = cos.getValue(accuracy, arg);

		double tg = sinValue/cosValue;
		System.out.println(tg);
	}
}