import java.util.Scanner;

public class fac{

	public static void main(String[] args) {
		int number, i, result;
		Scanner num = new Scanner(System.in);
		number = num.nextInt();
		i = 0;
		result = 1;
		while (i != number){
			i=i+1;
			result=result*i;
		}
		System.out.println(result);
	}
}