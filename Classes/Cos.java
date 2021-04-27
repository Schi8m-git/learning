import java.util.Scanner;

public class Cos{
	public static void countCos(){
		System.out.println("Введи значение аргумента");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double arg = Double.parseDouble(input);	
		System.out.println("Введите необходимую точность");
		double accuracy = scan.nextDouble();

		double cos = getCosValue(accuracy, arg);
		System.out.println("Cos("+arg+")="+cos);
		
	}

	public static double getCosValue(double accuracy, int x){
		return сosCounter(accuracy, (double) x);	
	}

	public static double getCosValue(double accuracy, double x){
		return сosCounter(accuracy, (double) x);	
	}

	public static double сosCounter(double accuracy, double x){
		int i = 0;
		int j = 2;
		double factorial;
		double	currentValue = 1;
		double  previousValue = 0;
		double sum = 1;
		double e = Math.abs(currentValue-previousValue);

		while(e>=accuracy){
	
			factorial = Factorial.getFactorial(j);
			previousValue = sum;
			double powValue = (double)(Math.pow(x, j))/factorial;
			sum = (i/2*2==i) ? (sum - powValue) : (sum + powValue);
			currentValue = sum;
			e = Math.abs(currentValue-previousValue);
			j += 2;
			i += 1;
		}
		return sum;
	}
}
