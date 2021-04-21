import java.util.Scanner;

public class Tg{
	public static void tgCounter(){
		System.out.println("Введи значение аргумента");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double arg = Double.parseDouble(input);	
		System.out.println("Введите необходимую точность");
		double accuracy = scan.nextDouble();

		double sin = getSinValue(accuracy, arg);
		double cos = getCosValue(accuracy,arg);
		double tg = sin/cos;
		System.out.println("Tg("+arg+")="+tg);
		

	}

	public static double getSinValue(double accuracy, double x){
			int i = 1;
			int j = 1;
			double factorial;
			double	currentValue = 1;
			double  previousValue = 0;
			double sum = 0;
			double e = Math.abs(currentValue-previousValue);

		while(e>=accuracy){
	
			factorial = getFactorial(j);
			previousValue = sum;
			sum = (i/2*2==i) ? (sum - (double)(Math.pow(x, j))/factorial) : (sum + (double)(Math.pow(x, j))/factorial);
			currentValue = sum;
			e = Math.abs(currentValue-previousValue);
			j += 2;
			i += 1;
		}
		return sum;
	}

	public static double getCosValue(double accuracy, double x){
		int i = 0;
		int j = 2;
		double factorial;
		double	currentValue = 1;
		double  previousValue = 0;
		double sum = 1;
		double e = Math.abs(currentValue-previousValue);

		while(e>=accuracy){
	
			factorial = getFactorial(j);
			previousValue = sum;
			sum = (i/2*2==i) ? (sum - (double)(Math.pow(x, j))/factorial) : (sum + (double)(Math.pow(x, j))/factorial);
			currentValue = sum;
			e = Math.abs(currentValue-previousValue);
			j += 2;
			i += 1;
		}
		return sum;
	}

	public static double getFactorial(int j){
		double factorial = 1;
		for (int k = 1; k<=j; k++){
				factorial = factorial * k;
			}
		return factorial;
	}
}