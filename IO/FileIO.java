import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIO{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("file.txt"));
		String firstNumberString = in.readLine();
		String secondNumberString = in.readLine();
		in.close();

		int firstNumber = Integer.parseInt(firstNumberString);
		int secondNumber = Integer.parseInt(secondNumberString);

		System.out.println(firstNumber * secondNumber);

	}
}
