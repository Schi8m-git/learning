import java.util.Scanner;

public class Tg{

	public static void main(String[] args){
		double accuracyValue;
		double sin;
		double cos;
		double tg;

		int arg = 5;
		System.out.println("Введите необходимую точность:");
		Scanner scan = new Scanner(System.in);
		accuracyValue = scan.nextDouble();
		sin = getSinValue(accuracyValue, arg);
		cos = getCosValue(accuracyValue, arg);
		tg = sin/cos;
		System.out.println(tg);
	}

	public static double getSinValue(double accuracy, int x){
				int i = 1;
				int j = 1;
				double factorial = 1;
				double	currentValue = 0;
				double  previousValue = 0;
				double sum = 0;

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

	public static double getSinValue(double accuracy, double x){
			int i = 1;
			int j = 1;
			double factorial = 1;
			double	currentValue = 0;
			double  previousValue = 0;
			double sum = 0;
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
	public static double getCosValue(double accuracy, int x){
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