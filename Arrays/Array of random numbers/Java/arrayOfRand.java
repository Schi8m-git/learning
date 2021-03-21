import java.util.Scanner;

public class arrayOfRand{
	public static void main(String[] args){
		int arrayLength, i, resultNumber;
		Scanner scan = new Scanner(System.in);
		i = 0;
		int[] arrayOfRand;
		arrayLength = scan.nextInt();
		arrayOfRand = new int[arrayLength];


		while (i<arrayLength){
			resultNumber = i * (int) (Math.random()*100);
			arrayOfRand[i] = resultNumber;
			i = i + 1;
		}
		for(int n=0; n<i; n++){
			System.out.println(arrayOfRand[n]);
		}
	}
}