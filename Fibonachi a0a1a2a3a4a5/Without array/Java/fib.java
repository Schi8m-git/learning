import java.util.Scanner;
public class fib{
	public static void main(String[] args) {
		int i, quantity, current, previous, sum;
		Scanner scan = new Scanner(System.in);
		i=1;
		quantity=scan.nextInt();
		current=1;
		previous=0;
		sum=0;
		String result_string = "" + current;
		while (i<quantity){
			sum=current;
			current=current+previous;
			previous=sum;
			i=i+1;
			result_string=result_string+current;
		}
		System.out.println(result_string);
	}
}