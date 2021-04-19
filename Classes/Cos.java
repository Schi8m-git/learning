import java.util.Scanner;

public class Cos{
	public static void cosCounter(){
		System.out.println("Введи значение аргумента");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double arg = Double.parseDouble(input);	
		System.out.println("Введите необходимую точность");
		double accuracy = scan.nextDouble();

		double cos = getCosValue(accuracy, arg);
		System.out.println("Cos("+arg+")="+cos);
		
	}

	public static double getCosValue(double accuracy, double x){
		int i = 0;
		int j = 2;
		double factorial = 1;
		double	currentValue = 0;
		double  previousValue = 0;
		double sum = 1;
		for(double e = 1; e>=accuracy; e = Math.abs(currentValue-previousValue)){
			factorial = getFactorial(j);
			if (i/2*2 == i){
				previousValue = sum;
				sum = sum - (double)(Math.pow(x, j))/factorial;
				currentValue = sum;
			}else{
				previousValue = sum;
				sum = sum + (double)(Math.pow(x, j))/factorial;
				currentValue = sum;
			}	
			factorial = 1;
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