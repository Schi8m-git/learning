
public class RandomMatrixException{
	public static void main(String[] args){
		int hight1 = 1 + (int)(Math.random()*10);
		int hight2 = 1 + (int)(Math.random()*10);
		int width2 = 1 + (int)(Math.random()*10);
		int width1 = hight2;
		System.out.println(hight1+""+width1+""+hight2+""+width2+""+"\n");
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
}


