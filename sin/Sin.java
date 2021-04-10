import java.util.Scanner;

public class Sin{
	public static void main(String[] args){
		int i = 1;
		int j = 1;
		double factorial = 1;
		double	currentValue = 0;
		double  previousValue = 0;
		double sum = 0;

		Scanner scan = new Scanner(System.in);
		String result = "";
		
		int arg = 5;
		

		System.out.println("Введите необходимую точность:");
		double accuracyValue = scan.nextDouble();	
		
		result = getSinValue(accuracyValue, arg, i, j, factorial, currentValue, previousValue, sum);

		System.out.println(result);

	}


	public static String getSinValue(double accuracy, int x, int i, int j, double factorial, double currentValue, double previousValue, double sum){
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
		String result = "" + sum;
		return result;
	}

	public static String getSinValue(double accuracy, double x, int i, int j, double factorial, double currentValue, double previousValue, double sum){
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
		String result = "" + sum;
		return result;
	}
	public static double getFactorial(int j){
		double factorial = 1;
		for (int k = 1; k<=j; k++){
				factorial = factorial * k;
			}
		return factorial;
	}
}