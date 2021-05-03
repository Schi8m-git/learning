public class SequenceComputer{

	 int initialI;
	 int initialJ;
	 double initialSum;

	public double getValue(
		double accuracy, int arg
	){
		System.out.println(initialI + " " + initialJ + " " + initialSum);
		return counter(
			accuracy,
			(double) arg, 
			initialI, 
			initialJ, 
			initialSum
		);
	}

	public double getValue(
		double accuracy, double arg
	){
		return counter(
			accuracy,
			(double) arg, 
			initialI, 
			initialJ, 
			initialSum
		);
	}

	private double counter(
		double accuracy, double x, int i, int j, double sum
	){

		double factorial;
		double	currentValue = 1;
		double  previousValue = 0;
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