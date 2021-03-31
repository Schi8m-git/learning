
public class StringArray extends PrinterMain{
	public void printer(){
		int arrayLength = 1 + (int)(Math.random()*10);
		int arrayWidth = 1 + (int)(Math.random()*10);
		String [][] arrayOfString = new String [arrayLength][arrayWidth];
		for(int i=0;i<arrayLength;i++){
			for (int j=0;j<arrayWidth;j++){
				arrayOfString[i][j] = "" + (1 + (int)(Math.random()*100));
				System.out.print(arrayOfString[i][j]+" ");
			}
			System.out.println("");
		}
	}
}