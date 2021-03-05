import java.util.Scanner;

public class zeroton{
	public static void main(String[] args) {
		int a,i,k;
		System.out.println("Введите число");
		Scanner num = new Scanner(System.in);
		a = num.nextInt();
		if (a > 0) {
			k = 1;
		}
		else{
			k = -1;
		}
		i = 0;
		System.out.println(i);
		while (i != a){
			i = i + k;
			System.out.println(i);
		}
	}
}