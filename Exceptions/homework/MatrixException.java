import calculator.Counter;
import java.util.Scanner;
import java.util.InputMismatchException;
import calculator.UnProportionalMatrixException;


public class MatrixException{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int hight1=0; int hight2=0; int width1=0; int width2=0;

			System.out.println("Введите высоту матрицы 1");
			hight1 = fetchIntFromConsole();
			System.out.println("Введите ширину матрицы 1");
			width1 = fetchIntFromConsole();
			System.out.println("Введите высоту матрицы 2");
			hight2 = fetchIntFromConsole();
			System.out.println("Введите ширину матрицы 2");
			width2 = fetchIntFromConsole();
			int[][] resultMatrix = null;
			int[][] matrix1 = createMatrix(hight1, width1);
			int[][] matrix2 = createMatrix(hight2, width2);
			try{
				resultMatrix = Counter.multiplyMatrix(matrix1, matrix2);
				printMatrix(matrix1);
				printMatrix(matrix2);
				printMatrix(resultMatrix);
			} catch (UnProportionalMatrixException e){
				System.out.println("Такие матрицы нельзя умножать.");
			}

			
	}

	public static int[][] createMatrix(int a, int b){
		int[][] matrix = new int[a][b];
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				matrix[i][j] = (int)(Math.random()*10);
			}
		}
		return matrix;
	}


	public static void printMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j]+" ");
			} 
			System.out.println("");
		}
		System.out.println("");
	}


	public static int fetchIntFromConsole(){
		Scanner scan = new Scanner(System.in);
		int a = 0;
		boolean incorrectInput = true;
		while(incorrectInput){
			try{
				a = scan.nextInt();
				incorrectInput = false;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Ты ввёл что-то не то, попробуй еще раз");
				scan.next();
			}
		}
		return a;
	}
}


