import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class MatrixIO{
	public static void main(String[] args) throws IOException{
		System.out.println("Привет, эта программа складывает матрицы" + 
			", считываемые из файлов на устройстве.\n");
		System.out.println("Для начала нажмите" + (char)34 + "Enter" + (char)34 + ", для выхода - " + (char)34 + "Esc" + (char)34);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int currentReadByte = reader.read();
		switch (currentReadByte){
			case (10): 
				start();
				break;
			case(0x1B):
				break;
		}
		
	}


	public static void start()throws IOException{
		System.out.println(" Введите путь к файлу с первой матрицей:");
		String fileDestination1 = getFileDestination();
		System.out.println("Введите путь к файлу со второй матрицей:");
		String fileDestination2 = getFileDestination();
		int[][] matrix1 = null;
		int[][] matrix2 = null;

		if((fileDestination1 != null)&(fileDestination2 != null)){
			matrix1 = readMatrixFromFile(fileDestination1);
			matrix2 = readMatrixFromFile(fileDestination2);
		}

		int[][] resultMatrix = matrixSummator(matrix1, matrix2);
		System.out.println("В результате сложения матрицы: \n");
		matrixPrinter(matrix1);
		System.out.println("И матрицы: \n");
		matrixPrinter(matrix2);
		System.out.println("Получилась матрица: \n");
		matrixPrinter(resultMatrix);
	}

	public static String getFileDestination()throws IOException{
		System.out.println("Для ввода пути нажмите " + (char)34 +"Enter" + (char)34 +", для выхода нажмите " + (char)34 + "Esc" + (char)34);
		String fileDestination = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int currentReadByte = reader.read();
		if (currentReadByte == 0x1B){
			System.out.println("Была нажата esc");
			start();
		} else{
			fileDestination = reader.readLine();
		}
		return fileDestination;
	}



	public static int[][] readMatrixFromFile(String fileDestination) throws IOException{
		ArrayList<String> arrayStringList = new ArrayList<String>();
		boolean fileNotFound = true;
		while (fileNotFound){
			try{
				BufferedReader in = new BufferedReader(new FileReader(fileDestination));	
				String currentReadString = in.readLine();
				if (currentReadString != null){
					while (currentReadString != null){
						arrayStringList.add(currentReadString);
						currentReadString = in.readLine();
					}
				}
				fileNotFound = false;
			} catch (FileNotFoundException e){
				System.out.println("Файл "+ fileDestination+ " не найден, попробуй еще раз.");
				fileDestination = getFileDestination();
			}
		}
		String[] arrayOfStrings = arrayStringList.toArray(new String[arrayStringList.size()]);
		int hight = arrayOfStrings.length;
		int width = arrayOfStrings[0].split(" ").length;
		int[][] matrix = new int[hight][width];

		for (int i = 0; i<hight; i++){
			for (int j = 0; j<width; j++){
				matrix[i][j] = Integer.parseInt(arrayOfStrings[i].split(" ")[j]);
			}
		}
		return matrix;
	}


	public static int[][] matrixSummator(int[][] matrix1, int[][] matrix2){
		int[][] resultMatrix = null;
		if ((matrix1.length == matrix2.length)&(matrix1[0].length == matrix2[0].length)){
			resultMatrix = new int[matrix1.length][matrix1[0].length];
			for (int i = 0; i<resultMatrix.length; i++){
				for (int j = 0; j<resultMatrix[0].length; j++){
					resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
		}else{
			System.out.println("Матрицы разного размера, укажите другие.");
		}
		return resultMatrix;
	}


	public static void matrixPrinter(int[][] matrix){
		for (int i = 0; i<matrix.length; i++){
			for (int j = 0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}