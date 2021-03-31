public class RealArray extends PrinterMain{
	public void printer(){
	int arrayLength = 1 + (int)(Math.random()*10);
	int	arrayWidth = 1 + (int)(Math.random()*10);
		float [][] arrayOfReal = new float [arrayLength][arrayWidth];
		for(int i=0;i<arrayLength;i++){
			for (int j=0;j<arrayWidth;j++){
				arrayOfReal[i][j] = 1 + (float)(Math.random()*100);
				System.out.printf("%,2f", arrayOfReal[i][j]);
			}
			System.out.println("");
		}
	}
}