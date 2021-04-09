import java.util.Scanner;

public class Sin{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String result = "";
		
		int arg = 5;
		

		System.out.println("Введите необходимую точность от 1 до 5:");
		int accuracyValue = scan.nextInt();	
		if (accuracyValue<1 | accuracyValue>5){
			accuracyValue = 1 + (int)(Math.random()*5);
			System.out.println("Вы указали неверное значение, точность установлена случайным образом на " + accuracyValue);
		}

		//Т.к. есть примерно минимальное кол-во выполнений, чтобы значение хотя бы укладывалось в 1
		accuracyValue += 6;
		
		result = countSin(accuracyValue, arg);

		System.out.println(result);

	}


	public static String countSin(int accuracyValue, int x){
		double sum=0;
		int j = 1;
		long factorial = 1;
		String sumResult = "";

		for (int i=1; i<=accuracyValue; i++){
			for (int k = 1; k<=j; k++){
				factorial = factorial*k;
			}
			if (i/2*2 == i){
				sum = sum - (double)(Math.pow(x, j))/factorial;
			}else{
				sum = sum + (double)(Math.pow(x, j))/factorial;
			}
			j += 2;
			factorial = 1;

			
		}
		sumResult = sumResult + sum;
		return sumResult;
	}

	public static String countSin(int accuracyValue, double x){
		double sum=0;
		int j = 1;
		long factorial = 1;
		String sumResult = "";

		for (int i=1; i<=accuracyValue; i++){
			for (int k = 1; k<=j; k++){
				factorial = factorial*k;
			}
			if (i/2*2 == i){
				sum = sum - (double)(Math.pow(x, j))/factorial;
			}else{
				sum = sum + (double)(Math.pow(x, j))/factorial;
			}
			j += 2;
			factorial = 1;

			
		}
		sumResult = sumResult + sum;
		return sumResult;
	}
}