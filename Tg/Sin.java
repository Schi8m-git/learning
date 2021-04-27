public class Sin{
	public static double getSinValue(double accuracy, int arg){
		return sinCounter(accuracy, (double) arg);
	}

	public static double getSinValue(double accuracy, double arg){
		return sinCounter(accuracy, (double) arg);
	}

	public static double sinCounter(double accuracy, double x){
			int i = 1;
			int j = 1;
			double factorial;
			double	currentValue = 1;
			double  previousValue = 0;
			double sum = 0;
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