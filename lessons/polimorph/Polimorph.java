public class Polimorph{
	public static void main(String[] args){
		int arrayLength = 1 + (int)(Math.random()*10);
		int arrayWidth = 1 + (int)(Math.random()*10);


		String[][] stringArray = new String [arrayLength][arrayWidth];
		double[][] doubleArray = new double [arrayLength][arrayWidth];
		int[][] intArray = new int [arrayLength][arrayWidth];

		//Заполнение массивов случайными числами от 0 до 100

		for (int i=0;i<arrayLength;i++){
			for(int j=0;j<arrayWidth;j++){
				intArray[i][j] = (int)(Math.random()*100);
			}
		}

		for (int i=0; i<arrayLength;i++){
			for (int j=0; i<arrayWidth;j++){
				doubleArray[i][j] = (Math.random()*100);
			}
		}

		for (int i=0;i<arrayLength;i++){
			for (int j=0; j<arrayWidth;j++){
				stringArray[i][j] = "" + (int)(Math.random()*100);
			}
		}

		printArray(arrayLength, arrayLength,intArray);
		printArray(arrayLength, arrayLength,doubleArray);
		printArray(arrayLength, arrayLength,stringArray);
	}

	public static void printArray(int arrLength, int arrWidth, int[][] arr){
		for(int i=0;i<arrLength;i++){
			for(int j=0;j<arrWidth;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void printArray(int arrLength, int arrWidth, double[][]arr){
		for(int i=0;i<arrLength;i++){
			for(int j=0;j<arrWidth;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void printArray(int arrLength, int arrWidth, String[][] arr){
		for(int i=0;i<arrLength;i++){
			for(int j=0;j<arrWidth;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}