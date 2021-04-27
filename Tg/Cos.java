public class Cos{
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
		Factorial fact = new Factorial();

		while(e>=accuracy){
	
			factorial = fact.getFactorial(j);
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