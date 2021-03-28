import java.util.Scanner;
import java.util.Arrays;
public class mainDiagonal{
	public static void main(String[] args){
		int arrayLength, i,j,k;
		j = 0;
		k = 0;
		arrayLength = 1 + (int)(Math.random()*10);
		int[][] matrix = new int [arrayLength+1][arrayLength+1];

		System.out.println("Матрица:");
		for (i=0;i<=arrayLength;i++){
			for(j=0; j<=arrayLength; j++){
				matrix[i][j] = (int)(Math.random()*10);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		i = 0;
		System.out.println("Элементы главной диагонали:");
		for (i=0; i<=arrayLength; i++){
			System.out.print(matrix[i][i]+" ");
		}
		System.out.println();
	}
}
