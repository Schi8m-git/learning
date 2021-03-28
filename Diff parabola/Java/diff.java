import java.util.Scanner;

public class diff{
	public static void main(String[] args) {
		float x1, x2, dx, dy, a, b, max, i;
		Scanner numScan = new Scanner(System.in);
		a = numScan.nextFloat();
		b = numScan.nextFloat();
		dx = (b - a)/100;
		x1 = a;
		x2 = a + dx;
		max = function(x1, x2);
		for (i = a; i <= b; i += dx){
			x1 = i;
			x2 = x1 + dx;
			dy = function(x1, x2);
			if (dy > max){
				max = dy;
			}
		}
		
		System.out.println(max);

	}
	public static float function (float funcX1, float funcX2){
		float funcResult;
		funcResult = (3 * funcX2*funcX2 - 893 * funcX2 - 2000) - (3 * funcX1*funcX1 - 893 * funcX1 - 2000);
		return funcResult;
	}
}