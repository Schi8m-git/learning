public class IntArray extends PrinterMain{
	public void printer(){
		int arrayLength = 1 + (int)(Math.random()*10);
		int arrayWidth = 1 + (int)(Math.random()*10);
		int [][] arrayOfInt = new int [arrayLength][arrayWidth];
		for(int i=0;i<arrayLength;i++){
			for (int j=0;j<arrayWidth;j++){
				arrayOfInt[i][j] = 1 + (int)(Math.random()*100);
				System.out.print(arrayOfInt[i][j]+" ");
			}
			System.out.println("");
		}
	}
}