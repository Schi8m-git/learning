public class Counter{
	public static int[][] multiplyMatrix(
		int[][] matrix1, 
		int[][] matrix2
		){

		
		int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
		int sum = 0;
		try{
			for (int i=0; i<matrix1.length; i++){
				for(int k=0; k<matrix2[0].length;k++){
					for (int j=0; j<matrix1[0].length; j++){
						resultMatrix[i][k] += matrix1[i][j]*matrix2[j][k];
					}
				}
			}
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("Такие матрицы умножать нельзя");
		}
		return resultMatrix;
	}
}