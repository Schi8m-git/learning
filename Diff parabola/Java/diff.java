import java.util.Scanner;

public class diff{
	public static void main(String[] args) {
		float x1,x2,d,x,max,dx,dy1,dy2,delt;
		Scanner num = new Scanner(System.in);
		x1 = num.nextFloat();
		x2 = num.nextFloat();
		d=x2-x1;
		dx=d/100;
		x=x1;
		max=(6*x1+6)*dx;
		while (x<x2){
			dy1=(6*x+6)*dx;
			x=x+dx;
			dy2=(6*x+6)*dx;
			delt=dy2-dy1;
			if (delt>max){
				max=delt;
			}
			
		
		}
		System.out.println(max);

	}
}