public class Polimorph{
	public static void main(String[] args){
		int arrayLength = 1 + (int)(Math.random()*10);
		int arrayWidth = 1 + (int)(Math.random()*10);


		String[][] stringArray = new String [arrayLength][arrayWidth];
		double[][] doubleArray = new double [arrayLength][arrayWidth];
		int[][] intArray = new int [arrayLength][arrayWidth];

		//Заполнение массивов случайными числами от 0 до 100

		for (int i=0;i<intArray.length;i++){
			for(int j=0;j<intArray[i].length;j++){
				intArray[i][j] = (int)(Math.random()*100);
			}
		}

		for (int i=0; i<doubleArray.length;i++){
			for (int j=0; j<doubleArray[i].length;j++){
				doubleArray[i][j] = (Math.random()*100);
			}
		}

		for (int i=0;i<stringArray.length;i++){
			for (int j=0; j<stringArray[i].length;j++){
				stringArray[i][j] = "" + (int)(Math.random()*100);
			}
		}

		printArray(intArray);
		printArray(doubleArray);
		printArray(stringArray);
	}

	public static void printArray(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void printArray(double[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void printArray(String[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}