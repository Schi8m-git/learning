import java.util.Scanner;

public class Cos{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double result;
		
		int input = 5;
		double arg = (double)input;
		

		System.out.println("Введите необходимую точность:");
		double accuracyValue = scan.nextDouble();	
		
		result = getCosValue(accuracyValue, arg);

		System.out.println(result);

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
			System.out.println(sum);
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
