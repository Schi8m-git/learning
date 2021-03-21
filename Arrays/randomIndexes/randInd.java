import java.util.Arrays;
public class randInd{
	public static void main(String[] args){
		int index1, index2,i,j,maxValue;
		index1 = (int)(Math.random()*10);
		index2 = (int)(Math.random()*10);

		int[][] matrix = new int [index1+1][index2+1];
		

		for (i=0;i<=index1;i++){
			for(j=0; j<=index2; j++){
				matrix[i][j] = (int)(Math.random()*100);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
		maxValue = matrix[0][0];
		for(i=0;i<=index1;i++){
			for(j=0;j<=index2;j++){
				if (maxValue<matrix[i][j]){
					maxValue = matrix[i][j];
				}
			}
		}
	System.out.println("Максимальный элемент: " + maxValue);
	}
}