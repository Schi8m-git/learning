import java.util.Scanner;

public class Sum
{
	public static void main(String[] args) {
		int a, b, c, do_not_close_the_window;
		Scanner num = new Scanner(System.in);
		System.out.println("Введите первое слагаемое:");
		a = num.nextInt();
		System.out.println("Введите второе слагаемое:");
		b = num.nextInt();
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		do_not_close_the_window = num.nextInt();
		
	}
}
