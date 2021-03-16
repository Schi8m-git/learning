import java.util.Scanner;
public class fib{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int quantity, i;
		i=2;
		quantity = scan.nextInt();
		int[] fibonachiArray;
		fibonachiArray = new int[quantity+1];
		fibonachiArray[0]=0;
		fibonachiArray[1]=1;
		String result = "" + fibonachiArray[1];
		while (i<=quantity){
			fibonachiArray[i] = fibonachiArray[i-1] + fibonachiArray[i-2];
			if ((i/2)*2 == i){
				result = result + fibonachiArray[i];
			} else {
				result = fibonachiArray[i] + result;
			}
			i=i+1;
		} 

System.out.println(result);
	}
}