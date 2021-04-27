import java.util.Scanner;

public class Tg{
	public static void countTg(){
		System.out.println("Введи значение аргумента");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double arg = Double.parseDouble(input);	
		System.out.println("Введите необходимую точность");
		double accuracy = scan.nextDouble();
	
		double sinValue = Sin.getSinValue(accuracy,arg);
		double cosValue = Cos.getCosValue(accuracy,arg);
		double tg = sinValue/cosValue;

		System.out.println("Tg("+arg+")="+tg);
		
	}
}