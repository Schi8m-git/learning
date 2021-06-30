import calculator.UnProportionalMatrixException;
import calculator.Counter;

public class RandomMatrixException{
	public static void main(String[] args){
		int hight1 = 1 + (int)(Math.random()*10);
		int hight2 = 1 + (int)(Math.random()*10);
		int width2 = 1 + (int)(Math.random()*10);
		int width1 = 1 + (int)(Math.random()*10);
		int[][] matrix1 = createMatrix(hight1, width1);
		int[][] matrix2 = createMatrix(hight2, width2);
		int[][] resultMatrix = null;
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
}


