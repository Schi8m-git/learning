import java.util.Scanner;
import java.util.InputMismatchException;

public class MatrixException{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int hight1=0; int hight2=0; int width1=0; int width2=0;

		boolean isNotProportionate = true;
		while (isNotProportionate){
			System.out.println("Введите высоту матрицы 1");
			hight1 = catchExceptions();
			System.out.println("Введите ширину матрицы 1");
			width1 = catchExceptions();
			System.out.println("Введите высоту матрицы 2");
			hight2 = catchExceptions();
			System.out.println("Введите ширину матрицы 2");
			width2 = catchExceptions();
			if (hight1==width2){
				isNotProportionate = false;
			}else{System.out.println("Такие матрицы нельзя умножить");}
		}
		int[][] matrix1 = createMatrix(hight1, width1);
		int[][] matrix2 = createMatrix(hight2, width2);

		int[][] resultMatrix = Counter.multiplyMatrix(matrix1, matrix2);
		for(int i=0; i<hight1; i++){
			for (int j=0; j<width2; j++){
				System.out.print(resultMatrix[i][j]+" ");
			} 
			System.out.println("");
		}
	}

	public static int[][] createMatrix(int a, int b){
		int[][] matrix = new int[a][b];
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				matrix[i][j] = (int)(Math.random()*10);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		return matrix;
	}


	public static int catchExceptions(){
		Scanner scan = new Scanner(System.in);
		int a = 0;
		while(true){
			try{
				a = scan.nextInt();
				break;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Ты ввёл что-то не то, попробуй еще раз");
				scan.next();
			}
		}
		return a;
	}
}


