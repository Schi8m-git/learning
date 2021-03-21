import java.util.Arrays;
public class randInd{
	public static void main(String[] args){
		int index1, index2,i,j,max;
		index1 = (int)(Math.random()*10);
		index2 = (int)(Math.random()*10);
		String stringTransfer = " ";

		int[][] matrix = new int [index1+1][index2+1];
		

		for (i=0;i<=index1;i++){
			for(j=0; j<=index2; j++){
				matrix[i][j] = (int)(Math.random()*100);
			}
		}
		max = matrix[0][0];
		for(i=0;i<=index1;i++){
			for(j=0;j<=index2;j++){
				if (max<matrix[i][j]){
					max = matrix[i][j];
				}
			}
		}
		for (i=0; i<=index1;i++){
			for (j=0;j<=index2;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("Максимальный элемент " + max);
	}
}