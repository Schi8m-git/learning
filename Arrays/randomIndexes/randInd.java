import java.util.Arrays;
public class randInd{
	public static void main(String[] args){
		int arrayLength, arrayWidth, i, j, maxValue;
		arrayLength = (int)(Math.random()*10);
		arrayWidth = (int)(Math.random()*10);

		int[][] matrix = new int [arrayLength+1][arrayWidth+1];
		

		for (i=0;i<=arrayLength;i++){
			for(j=0; j<=arrayWidth; j++){
				matrix[i][j] = (int)(Math.random()*100);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
		maxValue = matrix[0][0];
		for(i=0;i<=arrayLength;i++){
			for(j=0;j<=arrayWidth;j++){
				if (maxValue<matrix[i][j]){
					maxValue = matrix[i][j];
				}
			}
		}
	System.out.println("Максимальный элемент: " + maxValue);
	}
}
