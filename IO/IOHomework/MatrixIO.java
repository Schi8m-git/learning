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
		System.out.println("Для начала нажмите \"Enter\", для выхода - \"Esc\"");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int currentReadByte = reader.read();
		switch (currentReadByte){
			case (10): 
				start();
				break;
			case(27):
				System.exit(0);
				break;
		}
		
	}


	public static void start()throws IOException{
		String fileDestination1 = getFileDestination(1);
		String fileDestination2 = getFileDestination(2);
		int[][] matrix1 = null;
		int[][] matrix2 = null;

		if((fileDestination1 != null)&(fileDestination2 != null)){
			matrix1 = readMatrixFromFile(fileDestination1, 1);
			matrix2 = readMatrixFromFile(fileDestination2, 2);
		}

		int[][] resultMatrix = matrixSummator(matrix1, matrix2);
		System.out.println("В результате сложения матрицы: \n");
		matrixPrinter(matrix1);
		System.out.println("И матрицы: \n");
		matrixPrinter(matrix2);
		System.out.println("Получилась матрица: \n");
		matrixPrinter(resultMatrix);
	}

	public static String getFileDestination(int numberOfMatrix)throws IOException{
		System.out.println("Для ввода пути к файлу с " + numberOfMatrix + " матрицей нажмите \"Enter\", для выхода нажмите \"Esc\" ");
		String fileDestination = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int currentReadByte = reader.read();
		if (currentReadByte == 27){
			System.out.println("Была нажата esc");
			String[] args = new String[1];
			main(args); 
		} else{
			fileDestination = reader.readLine();
		}
		return fileDestination;
	}



	public static int[][] readMatrixFromFile(String fileDestination, int numberOfMatrix) throws IOException{
		ArrayList<String> arrayStringList = new ArrayList<String>();
		boolean incorrectFileDestination = true;
		while (incorrectFileDestination){
			try{
				BufferedReader in = new BufferedReader(new FileReader(fileDestination));	
				String currentReadString = in.readLine();
				if (currentReadString != null){
					while (currentReadString != null){
						arrayStringList.add(currentReadString);
						currentReadString = in.readLine();
					}
				}
				incorrectFileDestination = false;
			} catch (FileNotFoundException e){
				System.out.println("Файл "+ fileDestination+ " не найден, попробуй еще раз.");
				fileDestination = getFileDestination(numberOfMatrix);
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


	public static int[][] matrixSummator(int[][] matrix1, int[][] matrix2) throws IOException{
		int[][] resultMatrix = null;
		try{
			resultMatrix = new int[matrix1.length][matrix1[0].length];
			for (int i = 0; i<resultMatrix.length; i++){
				for (int j = 0; j<resultMatrix[0].length; j++){
					resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Матрицы разного размера, их нельзя сложить.");
			start();
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