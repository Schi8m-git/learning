public class Counter{
	public static int[][] multiplyMatrix(
		int[][] matrix1, 
		int[][] matrix2,
		int hight1,
		int width1,
		int width2
		){


		int[][] resultMatrix = new int[hight1][width2];
		int sum = 0;
		for (int i=0; i<hight1; i++){
			for(int k=0; k<width2;k++){
				for (int j=0; j<width1; j++){
					 resultMatrix[i][k] += matrix1[i][j]*matrix2[j][k];
				}
			}
		} 
		return resultMatrix;
	}
}