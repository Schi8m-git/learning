import java.util.Scanner;
import java.util.Arrays;
public class mainDiagonal{
	public static void main(String[] args){
		int index, i,j,k;
		j = 0;
		k = 0;
		index = (int)(Math.random()*10);
		int[][] matrix = new int [index+1][index+1];

		System.out.println("Матрица:");
		for (i=0;i<=index;i++){
			for(j=0; j<=index; j++){
				matrix[i][j] = (int)(Math.random()*10);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		i = 0;
		System.out.println("Элементы главной диагонали:");
		for (i=0; i<=index; i++){
			System.out.print(matrix[i][i]+" ");
		}
		System.out.println();
	}
}