import java.util.Scanner;

public class arrayOfRand{
	public static void main(String[] args){
		int arrayLength, i;
		Scanner scan = new Scanner(System.in);
		i = 0;
		int[] arrayOfRand;
		arrayLength = scan.nextInt();
		arrayOfRand = new int[arrayLength];


		while (i<arrayLength){
			arrayOfRand[i] = i * (int) (Math.random()*100);
			System.out.print(arrayOfRand[i] + " ");
			i = i + 1;	
		}
		System.out.println("");
	}
}