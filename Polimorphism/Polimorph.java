public class Polimorph{
	public static void main(String[] args){
		PrinterMain[] arrays = new PrinterMain[] {new IntArray(), new RealArray(), new StringArray()};
		for (int i=0; i<arrays.length;i++){
			arrays[i].printer();
		}
	}
}










