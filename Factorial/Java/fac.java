import java.util.Scanner;

public class fac{

	public static void main(String[] args) {
		int n, i, k, S;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		i = 0;
		S = 1;
		while (i != n){
			i=i+1;
			S=S*i;
		}
		System.out.println(S);
	}
}