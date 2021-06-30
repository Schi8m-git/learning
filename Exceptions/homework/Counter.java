package calculator;

public class Counter{
	public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) throws UnProportionalMatrixException{
		if (matrix1.length != matrix2[0].length){
			throw new UnProportionalMatrixException();
		}
		int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
		int sum = 0;
			for (int i=0; i<matrix1.length; i++){
				for(int k=0; k<matrix2[0].length;k++){
					for (int j=0; j<matrix1[0].length; j++){
						
							resultMatrix[i][k] += matrix1[i][j]*matrix2[j][k];
						}
						
				}
			}
		return resultMatrix;
	}
}